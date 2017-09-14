package com.akshar.assessment.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TestResults {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String studentProfileId;
	private String schoolCode;
	private int testDetailsId;
	private int questionId;
	private String studentAnswer;
	private String correctAnswer;
	private int marksScored;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStudentProfileId() {
		return studentProfileId;
	}
	public void setStudentProfileId(String studentProfileId) {
		this.studentProfileId = studentProfileId;
	}
	public String getSchoolCode() {
		return schoolCode;
	}
	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}
	public int getTestDetailsId() {
		return testDetailsId;
	}
	public void setTestDetailsId(int testDetailsId) {
		this.testDetailsId = testDetailsId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getStudentAnswer() {
		return studentAnswer;
	}
	public void setStudentAnswer(String studentAnswer) {
		this.studentAnswer = studentAnswer;
	}
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	public int getMarksScored() {
		return marksScored;
	}
	public void setMarksScored(int marksScored) {
		this.marksScored = marksScored;
	}
	
	@Override
	public String toString() {
		return "TestResults [id=" + id + ", studentProfileId=" + studentProfileId + ", schoolCode=" + schoolCode
				+ ", testDetailsId=" + testDetailsId + ", questionId=" + questionId + ", studentAnswer=" + studentAnswer
				+ ", correctAnswer=" + correctAnswer + ", marksScored=" + marksScored + "]";
	}
	
}
