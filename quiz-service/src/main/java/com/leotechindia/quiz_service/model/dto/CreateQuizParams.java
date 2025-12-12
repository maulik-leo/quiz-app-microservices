package com.leotechindia.quiz_service.model.dto;

import lombok.Data;

@Data
public class CreateQuizParams {
    String category;
    int noOfQuestions;
    String quizTitle;
}