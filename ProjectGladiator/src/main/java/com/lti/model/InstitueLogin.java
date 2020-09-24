package com.lti.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "INSTITUTE_LOGIN")
public class InstitueLogin implements Serializable {
	
	@Id
	@Column(name = "INSTITUTE_CODE")
	private String instituteCode;
	
	@Column(name = "INSTITUTE_PASSWORD")
	private String instituePassword;
	
	@OneToMany(mappedBy = "institute", cascade = CascadeType.ALL)
	private Set<StudentDetails> student;
	
	public InstitueLogin() {
		
	}
	
	public InstitueLogin(String instituteCode, String institutePassword) {
		super();
		this.instituteCode = instituteCode;
		this.instituePassword = institutePassword;
	}

	public String getInstituteCode() {
		return instituteCode;
	}

	public void setInstituteCode(String instituteCode) {
		this.instituteCode = instituteCode;
	}

	public String getInstitutePassword() {
		return instituePassword;
	}

	public void setInstitutePassword(String institutePassword) {
		this.instituePassword = institutePassword;
	}
	
	public Set<StudentDetails> getStudent() {
		return student;
	}

	public void setStudent(Set<StudentDetails> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "InstitueLogin [instituteCode=" + instituteCode + ", InstitutPassword=" + instituePassword + "]";
	}


	
	
}
