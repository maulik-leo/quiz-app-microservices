package com.leotechindia.quiz_service.controller;

import com.leotechindia.quiz_service.model.dto.AnswerOnly;
import com.leotechindia.quiz_service.model.dto.QuestionOnly;
import com.leotechindia.quiz_service.model.dto.CreateQuizParams;
import com.leotechindia.quiz_service.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

    // 1. Create Quiz using CATEGORY, NUM-OF-QUESTION, QUIZ-TITLE
    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestBody CreateQuizParams quizParams) {
        return quizService.createQuiz(quizParams.getCategory(), quizParams.getNoOfQuestions(), quizParams.getQuizTitle());
    }

    // 2. Get all questions of specific QUIZ using QUIZ-ID
    @GetMapping("get/{quiz_id}")
    public ResponseEntity<List<QuestionOnly>> getQuiz(@PathVariable("quiz_id") int quizId) {
        return quizService.getQuiz(quizId);
    }

    // 3. Submit specific QUIZ with QUIZ-ID and QUIZ-ANSWERS for getting QUIZ-SCORE
    @PostMapping("submit/{quiz_id}")
    public ResponseEntity<String> calculateQuizScore(@PathVariable("quiz_id") int quizId, @RequestBody List<AnswerOnly> answers) {
        return quizService.calculateQuizScore(quizId, answers);
    }
}