package com.questionService.QuestionService.repo;

import com.questionService.QuestionService.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionDao extends JpaRepository<Question,Long> {

    public List<Question> findByQuizId(Long id);


}
