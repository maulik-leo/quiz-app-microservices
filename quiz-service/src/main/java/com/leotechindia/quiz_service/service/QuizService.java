package com.leotechindia.quiz_service.service;


import com.leotechindia.quiz_service.dao.QuizDao;
import com.leotechindia.quiz_service.feign.QuizFeignInterface;
import com.leotechindia.quiz_service.model.dto.AnswerOnly;
import com.leotechindia.quiz_service.model.dto.QuestionOnly;
import com.leotechindia.quiz_service.model.entity.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;

    @Autowired
    QuizFeignInterface quizFeignInterface;

    public ResponseEntity<String> createQuiz(String category, int numOfQuestion, String quizTitle) {
        Quiz quiz = new Quiz();
        quiz.setQuizTitle(quizTitle);
        // calling url : /question/generate using Eureka client and openFeign Client Interfaces
        quiz.setQuestionIds(quizFeignInterface.getQuestionIdsGeneratedForQuiz(category, numOfQuestion).getBody());
        quizDao.save(quiz);
        return new ResponseEntity<>("Created quiz : " + quiz.getQuizTitle() + " (ID : " + quiz.getId() + ")", HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionOnly>> getQuiz(int quizId) {
        List<QuestionOnly> questionsForUser = new ArrayList<>();
        /*List<Question> questionsFromDB = quizDao.findById(quizId).get().getQuestions();
        for (Question q : questionsFromDB) {
            questionsForUser.add(new QuestionOnly(q.getId(), q.getQuestionTitle(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4()));
        }*/
        return new ResponseEntity<>(questionsForUser, HttpStatus.OK);
    }

    public ResponseEntity<String> calculateQuizScore(int quizId, List<AnswerOnly> answers) {
        /*List<Question> questionsOfQuiz = quizDao.findById(quizId).get().getQuestions();

        // This is weak logic, as no guarantee of both list are in same order or not, suggested to implement comparison logic using map
        int index = 0, correct = 0;
        for (AnswerOnly ans : answers) {
            if (questionsOfQuiz.get(index).getId() == ans.getQuestionId() && questionsOfQuiz.get(index).getRightAnswer().equals(ans.getAnswerByUser())) {
                correct++;
            }
            index++;
        }*/
        //return new ResponseEntity<>("Score : " + correct + " / " + questionsOfQuiz.size(), HttpStatus.OK);
        return new ResponseEntity<>("Score : ", HttpStatus.OK);
    }
}