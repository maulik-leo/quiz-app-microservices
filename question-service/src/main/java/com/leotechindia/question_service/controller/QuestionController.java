package com.leotechindia.question_service.controller;

import com.leotechindia.question_service.model.dto.AnswerOnly;
import com.leotechindia.question_service.model.dto.QuestionOnly;
import com.leotechindia.question_service.model.entity.Question;
import com.leotechindia.question_service.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    Environment env;

    @Autowired
    private QuestionService questionService;

    // 1. Search All available questions
    @GetMapping("all")
    public ResponseEntity<List<Question>> getAllQuestions() {
        System.out.println("Calling from :" + env.getProperty("local.server.port"));
        return questionService.getAllQuestions();
    }

    // 2. Search question with specified ID
    @GetMapping("id/{search_id}")
    public ResponseEntity<Question> getQuestionById(@PathVariable("search_id") int search_id) {
        return questionService.getQuestionById(search_id);
    }

    // 3. Search question with specified CATEGORY
    @GetMapping("cat/{search_category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable("search_category") String category) {
        return questionService.getQuestionsByCategory(category);
    }

    // 4. Add question
    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question newQuestion) {
        return questionService.addQuestion(newQuestion);
    }

    // 5. Get QuestionIds Generated For Quiz
    @GetMapping("generate")
    public ResponseEntity<List<Integer>> getQuestionIdsGeneratedForQuiz(@RequestParam("cat") String category, @RequestParam("noQ") int numOfQuestion) {
        return questionService.getQuestionIdsForQuiz(category, numOfQuestion);
    }

    // 6. Get Questions from QuestionIds
    @PostMapping("getQuestions")
    public ResponseEntity<List<QuestionOnly>> getQuestionsFromIds(@RequestBody List<Integer> questionIds) {
        return questionService.getQuestionsFromIds(questionIds);
    }

    // 7. Calculate Score from Answers
    @PostMapping("getScore")
    public ResponseEntity<String> calculateScoreFromAnswers(@RequestBody List<AnswerOnly> answers) {
        return questionService.calculateScoreFromAnswers(answers);
    }
}