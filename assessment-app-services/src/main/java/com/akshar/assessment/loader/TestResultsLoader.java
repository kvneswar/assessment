package com.akshar.assessment.loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.akshar.assessment.entities.TestResults;
import com.akshar.assessment.repository.TestResultsRepository;

@Component
public class TestResultsLoader implements CommandLineRunner{

	@Autowired
	private TestResultsRepository testResultsRepository; 
	
	@Override
	public void run(String... args) throws Exception {
		TestResults testResults = new TestResults();
		testResults.setSchoolCode("1234");
		testResults.setQuestionId(1);
		testResults.setCorrectAnswer("A");
		testResults.setStudentAnswer("A");
		testResults.setMarksScored(1);
		testResults.setTestDetailsId(10);
		testResults.setStudentProfileId("1234");
		
		testResultsRepository.save(testResults);
		testResultsRepository.findAll()
					.forEach(System.out::println);
	}

}
