package com.akshar.assessment.entities.projections;

import org.springframework.data.rest.core.config.Projection;

import com.akshar.assessment.entities.QuestionPaper;
import com.akshar.assessment.entities.TestDetails;

//@Projection(name = "question-paper-projection", types=QuestionPaper.class)
public interface QuestionPaperProjections {

	long getId();
	String getSchoolCode();
	int getQuestionNumber();
	int getQuestionBankId();
	TestDetails getTestDetails();
	
	void setTestDetails(TestDetails testDetails);
	void setSchoolCode(String schoolCode);
	void setQuestionNumber(int questionNumber);
	void setQuestionBankId(int questionBankId);
	
}
