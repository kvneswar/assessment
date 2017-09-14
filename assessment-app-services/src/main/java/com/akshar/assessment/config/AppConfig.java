package com.akshar.assessment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.akshar.assessment.entities.QuestionBank;
import com.akshar.assessment.entities.QuestionPaper;
import com.akshar.assessment.entities.TestDetails;
import com.akshar.assessment.entities.TestResults;

@Configuration
public class AppConfig {

	@Bean
	  public RepositoryRestConfigurer repositoryRestConfigurer() {

	    return new RepositoryRestConfigurerAdapter() {

	      @Override
	      public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
	        config.exposeIdsFor(QuestionBank.class, QuestionPaper.class, TestDetails.class, TestResults.class);
	      }
	    };
	  }
}
