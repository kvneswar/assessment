package com.akshar.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.akshar.assessment.entities.QuestionBank;

@Repository
@RepositoryRestResource(path="/questions")
public interface QuestionBankRepository extends JpaRepository<QuestionBank, Long>{
	
	QuestionBank findByCls(@Param("cls") String cls);
	
}
