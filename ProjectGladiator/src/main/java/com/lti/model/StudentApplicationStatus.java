package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_APPLICATION_STATUS")
public class StudentApplicationStatus {
	@Id
	@Column(name="STUDENT_AADHAR_NO")
	private String studentAadharNo;
	
	@Column(name = "STATUS")
	private String status;
	
	public StudentApplicationStatus() {
		
	}

	public StudentApplicationStatus(String studentAadharNo, String status) {
		super();
		this.studentAadharNo = studentAadharNo;
		this.status = status;
	}

	public String getStudentAadharNo() {
		return studentAadharNo;
	}

	public void setStudentAadharNo(String studentAadharNo) {
		this.studentAadharNo = studentAadharNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "StudentApplicationStatus [studentAadharNo=" + studentAadharNo + ", status=" + status + "]";
	}

	
}