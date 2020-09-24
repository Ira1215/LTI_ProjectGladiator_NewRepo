package com.lti.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INSTITUTE_APPLICATION_STATUS")
public class InstituteApplicationStatus implements Serializable{
	@Id
	@Column(name = "INSTITUTE_APPLICATION_NO")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long instituteApplicationNo;
	
	@Column(name = "INSTITUTE_STATUS")
	private String instituteStatus;
	
	public InstituteApplicationStatus() {
		super();
	}

	public InstituteApplicationStatus(String instituteStatus) {
		super();
		this.instituteStatus = instituteStatus;
	}

	public long getInstituteApplicationNo() {
		return instituteApplicationNo;
	}

	public void setInstituteApplicationNo(long instituteApplicationNo) {
		this.instituteApplicationNo = instituteApplicationNo;
	}

	public String getInstituteStatus() {
		return instituteStatus;
	}

	public void setInstituteStatus(String instituteStatus) {
		this.instituteStatus = instituteStatus;
	}

	@Override
	public String toString() {
		return "InstituteApplicationStatus [instituteApplicationNo=" + instituteApplicationNo + ", instituteStatus="
				+ instituteStatus + "]";
	}
	
}
