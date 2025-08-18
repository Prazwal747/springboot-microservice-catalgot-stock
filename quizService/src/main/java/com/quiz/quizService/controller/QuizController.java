package com.quiz.quizService.controller;

import com.quiz.quizService.entities.Quiz;
import com.quiz.quizService.service.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    //create
    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }


    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }

//    @GetMapping
//    public List<Quiz> getAll(){
//        return quizService.get();
//    }

    @GetMapping("/{id}")
    public Quiz getOne(@PathVariable Long id){
        return quizService.get(id);
    }

    @GetMapping("/get")
    public List<Quiz> getWithQuestions(){
        return quizService.get();
    }



}
