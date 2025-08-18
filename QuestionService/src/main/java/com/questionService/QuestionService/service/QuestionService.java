package com.questionService.QuestionService.service;

import com.questionService.QuestionService.entity.Question;

import java.util.List;

public interface QuestionService {

    public Question create(Question question);

    public List<Question> getAll();

    public Question getOne(Long id);

    public List<Question> getQuestionOfQuiz(Long quizId);

}
