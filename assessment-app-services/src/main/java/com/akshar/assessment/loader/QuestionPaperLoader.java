package com.akshar.assessment.loader;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.akshar.assessment.entities.QuestionPaper;
import com.akshar.assessment.entities.TestDetails;
import com.akshar.assessment.repository.QuestionPaperRepository;
import com.akshar.assessment.repository.TestDetailsRepository;

@Component
public class QuestionPaperLoader implements CommandLineRunner {

	@Autowired
	private QuestionPaperRepository questionPaperRepository;  
	
	@Autowired
	private TestDetailsRepository testDetailsRepository;
	
	@Override
	public void run(String... args) throws Exception {

		QuestionPaper questionPaper1 = new QuestionPaper();
		questionPaper1.setQuestionBankId(20);
		questionPaper1.setQuestionNumber(1);
		questionPaper1.setSchoolCode("1234");
		
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
		
		questionPaper1.setTestDetails(testDetails);
		
		questionPaperRepository.save(questionPaper1);
		questionPaperRepository.flush();
		
		questionPaperRepository.findAll()
							.forEach(System.out::println);

	}

}
