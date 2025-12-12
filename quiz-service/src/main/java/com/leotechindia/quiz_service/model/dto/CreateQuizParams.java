package com.leotechindia.quiz_service.model.dto;

import lombok.Data;

@Data
public class CreateQuizParams {
    String cat;
    int noQ;
    String qTitle;
}