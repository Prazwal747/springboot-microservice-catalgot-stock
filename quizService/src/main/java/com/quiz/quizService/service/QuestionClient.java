package com.quiz.quizService.service;

import com.quiz.quizService.entities.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "QUESTION-SERVICE")
public interface QuestionClient {

    @GetMapping("/questions/quiz/{quizId}")
    List<Question> getQuestionOfQuiz(@PathVariable Long quizId);

}
