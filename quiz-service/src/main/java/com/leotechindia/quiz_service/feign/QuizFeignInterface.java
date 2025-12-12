package com.leotechindia.quiz_service.feign;

import com.leotechindia.quiz_service.model.dto.AnswerOnly;
import com.leotechindia.quiz_service.model.dto.QuestionOnly;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("question-service")
public interface QuizFeignInterface {
    // All 3 from question-service
    // 5. Get QuestionIds Generated For Quiz
    @GetMapping("question/generate")
    public ResponseEntity<List<Integer>> getQuestionIdsGeneratedForQuiz(@RequestParam("cat") String category, @RequestParam("noQ") int numOfQuestion);

    // 6. Get Questions from QuestionIds
    @PostMapping("question/getQuestions")
    public ResponseEntity<List<QuestionOnly>> getQuestionsFromIds(@RequestBody List<Integer> questionIds);

    // 7. Calculate Score from Answers
    @PostMapping("question/getScore")
    public ResponseEntity<String> calculateScoreFromAnswers(@RequestBody List<AnswerOnly> answers);
}