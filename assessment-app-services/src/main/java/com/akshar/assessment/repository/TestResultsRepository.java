package com.akshar.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.akshar.assessment.entities.TestResults;

@Repository
@RepositoryRestResource(path="/test-results")
public interface TestResultsRepository extends JpaRepository<TestResults, Long>{

}
