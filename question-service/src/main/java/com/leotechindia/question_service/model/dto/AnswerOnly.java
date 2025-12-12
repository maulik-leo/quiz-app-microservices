package com.leotechindia.question_service.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnswerOnly {
    int questionId;
    String answerByUser;
}