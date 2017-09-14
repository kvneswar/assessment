package com.akshar.assessment.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TestDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String schoolCode;
	private String testName;
	private String testDescription;
	private String subjectName;
	private String courseId;
	private String classroomsList;
	private String maxMarks;
	private String timeLimit;
	private Date scheduledDate;
	/*@OneToMany(cascade=CascadeType.ALL)
	private List<QuestionPaper> questionPapers = new ArrayList<>();
	
	public List<QuestionPaper> getQuestionPapers() {
		return questionPapers;
	}
	public void setQuestionPapers(List<QuestionPaper> questionPapers) {
		this.questionPapers = questionPapers;
	}*/
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSchoolCode() {
		return schoolCode;
	}
	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getTestDescription() {
		return testDescription;
	}
	public void setTestDescription(String testDescription) {
		this.testDescription = testDescription;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getClassroomsList() {
		return classroomsList;
	}
	public void setClassroomsList(String classroomsList) {
		this.classroomsList = classroomsList;
	}
	public String getMaxMarks() {
		return maxMarks;
	}
	public void setMaxMarks(String maxMarks) {
		this.maxMarks = maxMarks;
	}
	public String getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(String timeLimit) {
		this.timeLimit = timeLimit;
	}
	public Date getScheduledDate() {
		return scheduledDate;
	}
	public void setScheduledDate(Date scheduledDate) {
		this.scheduledDate = scheduledDate;
	}
	
	@Override
	public String toString() {
		return "TestDetails [id=" + id + ", schoolCode=" + schoolCode + ", testName=" + testName + ", testDescription="
				+ testDescription + ", subjectName=" + subjectName + ", courseId=" + courseId + ", classroomsList="
				+ classroomsList + ", maxMarks=" + maxMarks + ", timeLimit=" + timeLimit + ", scheduledDate="
				+ scheduledDate + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classroomsList == null) ? 0 : classroomsList.hashCode());
		result = prime * result + ((courseId == null) ? 0 : courseId.hashCode());
		//result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((maxMarks == null) ? 0 : maxMarks.hashCode());
		result = prime * result + ((scheduledDate == null) ? 0 : scheduledDate.hashCode());
		result = prime * result + ((schoolCode == null) ? 0 : schoolCode.hashCode());
		result = prime * result + ((subjectName == null) ? 0 : subjectName.hashCode());
		result = prime * result + ((testDescription == null) ? 0 : testDescription.hashCode());
		result = prime * result + ((testName == null) ? 0 : testName.hashCode());
		result = prime * result + ((timeLimit == null) ? 0 : timeLimit.hashCode());
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
		TestDetails other = (TestDetails) obj;
		if (classroomsList == null) {
			if (other.classroomsList != null)
				return false;
		} else if (!classroomsList.equals(other.classroomsList))
			return false;
		if (courseId == null) {
			if (other.courseId != null)
				return false;
		} else if (!courseId.equals(other.courseId))
			return false;
		/*if (id != other.id)
			return false;*/
		if (maxMarks == null) {
			if (other.maxMarks != null)
				return false;
		} else if (!maxMarks.equals(other.maxMarks))
			return false;
		if (scheduledDate == null) {
			if (other.scheduledDate != null)
				return false;
		} else if (!scheduledDate.equals(other.scheduledDate))
			return false;
		if (schoolCode == null) {
			if (other.schoolCode != null)
				return false;
		} else if (!schoolCode.equals(other.schoolCode))
			return false;
		if (subjectName == null) {
			if (other.subjectName != null)
				return false;
		} else if (!subjectName.equals(other.subjectName))
			return false;
		if (testDescription == null) {
			if (other.testDescription != null)
				return false;
		} else if (!testDescription.equals(other.testDescription))
			return false;
		if (testName == null) {
			if (other.testName != null)
				return false;
		} else if (!testName.equals(other.testName))
			return false;
		if (timeLimit == null) {
			if (other.timeLimit != null)
				return false;
		} else if (!timeLimit.equals(other.timeLimit))
			return false;
		return true;
	}

	
	
}
