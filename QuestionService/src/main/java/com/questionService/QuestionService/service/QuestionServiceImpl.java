package com.questionService.QuestionService.service;

import com.questionService.QuestionService.entity.Question;
import com.questionService.QuestionService.repo.QuestionDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionDao questionDao;

    public QuestionServiceImpl(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    @Override
    public Question create(Question question) {
        return questionDao.save(question);
    }

    @Override
    public List<Question> getAll() {
        return questionDao.findAll();
    }

    @Override
    public Question getOne(Long id) {
        Optional<Question> question = questionDao.findById(id);

        return question.orElseThrow(()->new RuntimeException("Not found"));
    }

    @Override
    public List<Question> getQuestionOfQuiz(Long quizId) {
        return questionDao.findByQuizId(quizId);
    }
}
