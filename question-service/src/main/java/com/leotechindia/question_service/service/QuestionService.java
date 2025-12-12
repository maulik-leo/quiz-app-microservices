package com.leotechindia.question_service.service;

import com.leotechindia.question_service.dao.QuestionDao;
import com.leotechindia.question_service.model.dto.AnswerOnly;
import com.leotechindia.question_service.model.dto.QuestionOnly;
import com.leotechindia.question_service.model.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    @Autowired
    private QuestionDao questionDao;

    public ResponseEntity<List<Question>> getAllQuestions() {
        try {
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<Question> getQuestionById(int searchId) {
        try {
            Optional<Question> optQuestion = questionDao.findById(searchId);
            return new ResponseEntity<>(optQuestion.orElse(null), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new Question(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {
        try {
            return new ResponseEntity<>(questionDao.findByCategory(category), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addQuestion(Question newQuestion) {
        try {
            questionDao.save(newQuestion);
            return new ResponseEntity<>("Added new Question in " + newQuestion.getCategory() + " category !", HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST.getReasonPhrase(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Integer>> getQuestionIdsForQuiz(String category, int numOfQuestion) {
        return new ResponseEntity<>(questionDao.findRandomQuestionsByCategory(category, numOfQuestion), HttpStatus.OK);
    }

    public ResponseEntity<List<QuestionOnly>> getQuestionsFromIds(List<Integer> questionIds) {
        List<QuestionOnly> questionsForUser = new ArrayList<>(questionIds.size());
        Question q = null;
        for (Integer id : questionIds) {
            q = questionDao.findById(id).get();
            questionsForUser.add(new QuestionOnly(q.getId(), q.getQuestionTitle(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4()));
        }
        return new ResponseEntity<>(questionsForUser, HttpStatus.OK);
    }

    public ResponseEntity<String> calculateScoreFromAnswers(List<AnswerOnly> answers) {
        int correct = 0;
        Question question = null;
        for (AnswerOnly ans : answers) {
            question = questionDao.findById(ans.getQuestionId()).get();
            if (question.getRightAnswer().equals(ans.getAnswerByUser())) {
                correct++;
            }
        }
        return new ResponseEntity<>("Score : " + correct + " / " + answers.size(), HttpStatus.OK);
    }
}