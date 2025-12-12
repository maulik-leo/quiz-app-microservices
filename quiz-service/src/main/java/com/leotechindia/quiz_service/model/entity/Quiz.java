package com.leotechindia.quiz_service.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String quizTitle;
    @ElementCollection
    private List<Integer> questionIds;
}