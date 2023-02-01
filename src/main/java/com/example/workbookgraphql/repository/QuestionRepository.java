package com.example.workbookgraphql.repository;

import com.example.workbookgraphql.model.Question;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    @Query("SELECT q FROM Question q ORDER BY q.id DESC")
    List<Question> getAllQuestionsWithLimit(Pageable pageable);

}