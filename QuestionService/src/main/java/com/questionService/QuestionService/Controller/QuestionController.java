package com.questionService.QuestionService.Controller;

import com.questionService.QuestionService.entity.Question;
import com.questionService.QuestionService.service.QuestionServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    private QuestionServiceImpl questionService;

    public QuestionController(QuestionServiceImpl questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/{qid}")
    public Question getQuestion(@PathVariable Long qid){
        return questionService.getOne(qid);
    }

    @GetMapping
    public List<Question> getAll(){
        return questionService.getAll();
    }

    @PostMapping
    public Question add(@RequestBody Question question){
        return questionService.create(question);
    }

    @GetMapping("/quiz/{quizid}")
    public List<Question> getQuestionByQuizId(@PathVariable Long quizid){
        return questionService.getQuestionOfQuiz(quizid);
    }

}
