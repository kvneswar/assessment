package com.akshar.assessment.loader;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.akshar.assessment.entities.TestDetails;
import com.akshar.assessment.repository.TestDetailsRepository;

@Component
public class TestDetailsDataLoader implements CommandLineRunner {

	@Autowired
	private TestDetailsRepository testDetailsDataLoader;
	
	@Override
	public void run(String... args) throws Exception {

		TestDetails testDetails = new TestDetails();
		testDetails.setTestName("UnitTest1");
		testDetails.setTestDescription("This is unit test 1");
		testDetails.setCourseId("");
		testDetails.setSubjectName("Science");
		testDetails.setMaxMarks("25");
		testDetails.setTimeLimit("30");
		testDetails.setScheduledDate(new Date());
		testDetails.setSchoolCode("1234");
		testDetails.setClassroomsList("");
		
		
/*		testDetailsDataLoader.save(testDetails);
		testDetailsDataLoader.findAll().forEach(System.out :: println);*/
	}

}
