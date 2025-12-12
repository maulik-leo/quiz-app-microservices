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
        List<Integer> questionsIds = quizDao.findById(quizId).get().getQuestionIds();
        return new ResponseEntity<>(quizFeignInterface.getQuestionsFromIds(questionsIds).getBody(), HttpStatus.OK);
    }

    public ResponseEntity<String> calculateQuizScore(int quizId, List<AnswerOnly> answers) {
        return quizFeignInterface.calculateScoreFromAnswers(answers);
    }
}