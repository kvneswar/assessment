package com.akshar.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.akshar.assessment.entities.TestDetails;

@Repository
@RepositoryRestResource(path="/test-details")
public interface TestDetailsRepository extends JpaRepository<TestDetails, Long> {

}