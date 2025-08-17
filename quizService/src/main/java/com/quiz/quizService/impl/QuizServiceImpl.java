package com.quiz.quizService.impl;

import com.quiz.quizService.entities.Quiz;
import com.quiz.quizService.repositories.QuizRepository;
import com.quiz.quizService.service.QuizService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QuizServiceImpl implements QuizService {

    private QuizRepository quizRepository;

    public QuizServiceImpl(QuizRepository quizRepository){
        this.quizRepository = quizRepository;
    }


    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz get(Long id) {
        return quizRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Resource not found for specified Id"));
    }

}
