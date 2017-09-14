package com.akshar.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.akshar.assessment.entities.QuestionPaper;

@Repository
@RepositoryRestResource(path="/question-paper")
public interface QuestionPaperRepository extends JpaRepository<QuestionPaper, Long> {

}
