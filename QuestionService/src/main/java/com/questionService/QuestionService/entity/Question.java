package com.questionService.QuestionService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quid;

    private String question;

    private Long quizId;

    public Question() {
    }

    public Question(Long quid, String question, Long quiId) {
        this.quid = quid;
        this.question = question;
        this.quizId = quiId;
    }

    public Long getQuid() {
        return quid;
    }

    public void setQuid(Long quid) {
        this.quid = quid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Long getQuizId() {
        return quizId;
    }

    public void setQuizId(Long quizId) {
        this.quizId = quizId;
    }
}
