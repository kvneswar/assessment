package com.akshar.assessment.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class QuestionPaper {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	//private long testDetailsId;
	private String schoolCode;
	private int questionNumber;
	private int questionBankId;
	@ManyToOne(cascade=CascadeType.ALL)
	private TestDetails testDetails;
	
	public TestDetails getTestDetails() {
		return testDetails;
	}
	public void setTestDetails(TestDetails testDetails) {
		this.testDetails = testDetails;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
/*	public long getTestDetailsId() {
		return testDetailsId;
	}
	public void setTestDetailsId(long testDetailsId) {
		this.testDetailsId = testDetailsId;
	}*/
	public String getSchoolCode() {
		return schoolCode;
	}
	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}
	public int getQuestionNumber() {
		return questionNumber;
	}
	public void setQuestionNumber(int questionNumber) {
		this.questionNumber = questionNumber;
	}
	public int getQuestionBankId() {
		return questionBankId;
	}
	public void setQuestionBankId(int questionBankId) {
		this.questionBankId = questionBankId;
	}
	
	@Override
	public String toString() {
		return "QuestionPaper [id=" + id + ", testDetailsId=" + /*testDetailsId +*/ ", schoolCode=" + schoolCode
				+ ", questionNumber=" + questionNumber + ", questionBankId=" + questionBankId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + questionBankId;
		result = prime * result + questionNumber;
		result = prime * result + ((schoolCode == null) ? 0 : schoolCode.hashCode());
		result = prime * result + ((testDetails == null) ? 0 : testDetails.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuestionPaper other = (QuestionPaper) obj;
		if (id != other.id)
			return false;
		if (questionBankId != other.questionBankId)
			return false;
		if (questionNumber != other.questionNumber)
			return false;
		if (schoolCode == null) {
			if (other.schoolCode != null)
				return false;
		} else if (!schoolCode.equals(other.schoolCode))
			return false;
		if (testDetails == null) {
			if (other.testDetails != null)
				return false;
		} else if (!testDetails.equals(other.testDetails))
			return false;
		return true;
	}
	
	
	
}
