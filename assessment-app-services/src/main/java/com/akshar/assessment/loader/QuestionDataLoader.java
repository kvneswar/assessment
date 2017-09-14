package com.akshar.assessment.loader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.akshar.assessment.entities.QuestionBank;
import com.akshar.assessment.repository.QuestionBankRepository;

@Component
public class QuestionDataLoader implements CommandLineRunner {

	@Autowired
	private QuestionBankRepository questionBankRepository;
	
	@Override
	public void run(String... args) throws Exception {

		QuestionBank questionBank = new QuestionBank();
		questionBank.setQuestion("What is your name?");
		questionBank.setOption1("Eswar");
		questionBank.setOption2("Lakshmi");
		questionBank.setOption3("Aravind");
		questionBank.setOption4("Srinu");
		questionBank.setAnswer("A");
		questionBank.setMaxMarks(1);
		questionBank.setQuestionType("ObjectiveType");
		questionBank.setSchoolCode("1234A");
		questionBank.setComplexity("simple");
		questionBank.setType("short");
		questionBank.setCls("1A");
		questionBank.setSubject("GK");
		questionBankRepository.save(questionBank);

		questionBankRepository.findAll()
							.forEach(System.out::println);;
	}

}
