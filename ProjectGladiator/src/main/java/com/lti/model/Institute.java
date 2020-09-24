package com.lti.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.criteria.CriteriaBuilder.In;

@Entity
@Table(name ="INSTITUTE_TBL")
public class Institute implements Serializable {
	@Id
	@Column(name = "DISE_CODE")
	private String diseCode;
	
	@Column(name = "INSTITUTE_NAME")
	private String instituteName;
	
	@Column(name="INSTITUTE_CATEGORY")
	private  String instituteCategory;
	
	@Column(name="INSTITUTE_LOCATION")
	private String instituteLocation;
	
	@Column(name="INSTITUTE_TYPE")
	private String instituteType;
	
	@Column(name="AFFILIATED_UNIVERSITY_STATE")
	private String affiliatedUniversityState;
	
	@Column(name="AFFILIATED_UNIVERSITYBOARD_NAME")
	private String affiliatedUniversityBoardName;
	
	@Column(name="YEAR_ADMISSION_STARTED")
	private Date yearAdmissionStarted;
	
	@Column(name="UNIVERSITY_AFFILIATION_CERTIFICATE")
	private String universityAffiliationCertificate;   //to be uploaded
	
	@Column(name="INSTITUTE_ESTABLISHMENT_CERTIFICATE")
	private String instituteEstablishmentCertificate;  //to be uploaded
	
	@Column(name="ADDRESS_LINE1")
	private String addressLine1;
	
	@Column(name="ADDRESS_LINE2")
	private String addressLine2;
	
	@Column(name = "INSTITUTE_STATE")
	private String instituteState;
	
	@Column(name="DISTRICT")
	private String district;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name = "PINCODE")
	private long pincode;
	
	@Column(name = "INSTITUTE_PINCODE")
	private long institutePincode;
	
	@Column(name="INSTITUTE_HEAD_NAME")
	private String instituteHeadName;
	
	@Column(name = "INSTITUTE_HEAD_CONTACT")
	private String instituteHeadContact;
	
	@OneToOne
	@JoinColumn(name = "institute_application_no")
	private InstituteApplicationStatus appStatus;
	
	@OneToOne
	@JoinColumn(name="INSTITUTE_CODE")
	private InstitueLogin login;
	
	
	public Institute()
	{
		
	}

	public Institute(String diseCode, String instituteName, String instituteCategory, String instituteLocation,
			String instituteType, String affiliatedUniversityState, String affiliatedUniversityBoardName,
			Date yearAdmissionStarted, String universityAffiliationCertificate,
			String instituteEstablishmentCertificate, String addressLine1, String addressLine2, String instituteState,
			String district, String city, long pincode, long institutePincode, String instituteHeadName,
			String instituteHeadContact, InstituteApplicationStatus appStatus, InstitueLogin login) {
		super();
		this.diseCode = diseCode;
		this.instituteName = instituteName;
		this.instituteCategory = instituteCategory;
		this.instituteLocation = instituteLocation;
		this.instituteType = instituteType;
		this.affiliatedUniversityState = affiliatedUniversityState;
		this.affiliatedUniversityBoardName = affiliatedUniversityBoardName;
		this.yearAdmissionStarted = yearAdmissionStarted;
		this.universityAffiliationCertificate = universityAffiliationCertificate;
		this.instituteEstablishmentCertificate = instituteEstablishmentCertificate;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.instituteState = instituteState;
		this.district = district;
		this.city = city;
		this.pincode = pincode;
		this.institutePincode = institutePincode;
		this.instituteHeadName = instituteHeadName;
		this.instituteHeadContact = instituteHeadContact;
		this.appStatus = appStatus;
		this.login = login;
	}

	public String getDiseCode() {
		return diseCode;
	}

	public void setDiseCode(String diseCode) {
		this.diseCode = diseCode;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getInstituteCategory() {
		return instituteCategory;
	}

	public void setInstituteCategory(String instituteCategory) {
		this.instituteCategory = instituteCategory;
	}

	public String getInstituteLocation() {
		return instituteLocation;
	}

	public void setInstituteLocation(String instituteLocation) {
		this.instituteLocation = instituteLocation;
	}

	public String getInstituteType() {
		return instituteType;
	}

	public void setInstituteType(String instituteType) {
		this.instituteType = instituteType;
	}

	public String getAffiliatedUniversityState() {
		return affiliatedUniversityState;
	}

	public void setAffiliatedUniversityState(String affiliatedUniversityState) {
		this.affiliatedUniversityState = affiliatedUniversityState;
	}

	public String getAffiliatedUniversityBoardName() {
		return affiliatedUniversityBoardName;
	}

	public void setAffiliatedUniversityBoardName(String affiliatedUniversityBoardName) {
		this.affiliatedUniversityBoardName = affiliatedUniversityBoardName;
	}

	public Date getYearAdmissionStarted() {
		return yearAdmissionStarted;
	}

	public void setYearAdmissionStarted(Date yearAdmissionStarted) {
		this.yearAdmissionStarted = yearAdmissionStarted;
	}

	public String getUniversityAffiliationCertificate() {
		return universityAffiliationCertificate;
	}

	public void setUniversityAffiliationCertificate(String universityAffiliationCertificate) {
		this.universityAffiliationCertificate = universityAffiliationCertificate;
	}

	public String getInstituteEstablishmentCertificate() {
		return instituteEstablishmentCertificate;
	}

	public void setInstituteEstablishmentCertificate(String instituteEstablishmentCertificate) {
		this.instituteEstablishmentCertificate = instituteEstablishmentCertificate;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getInstituteState() {
		return instituteState;
	}

	public void setInstituteState(String instituteState) {
		this.instituteState = instituteState;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public long getInstitutePincode() {
		return institutePincode;
	}

	public void setInstitutePincode(long institutePincode) {
		this.institutePincode = institutePincode;
	}

	public String getInstituteHeadName() {
		return instituteHeadName;
	}

	public void setInstituteHeadName(String instituteHeadName) {
		this.instituteHeadName = instituteHeadName;
	}

	public String getInstituteHeadContact() {
		return instituteHeadContact;
	}

	public void setInstituteHeadContact(String instituteHeadContact) {
		this.instituteHeadContact = instituteHeadContact;
	}

	public InstituteApplicationStatus getAppStatus() {
		return appStatus;
	}

	public void setAppStatus(InstituteApplicationStatus appStatus) {
		this.appStatus = appStatus;
	}

	public InstitueLogin getLogin() {
		return login;
	}

	public void setLogin(InstitueLogin login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return "Institute [diseCode=" + diseCode + ", instituteName=" + instituteName + ", instituteCategory="
				+ instituteCategory + ", instituteLocation=" + instituteLocation + ", instituteType=" + instituteType
				+ ", affiliatedUniversityState=" + affiliatedUniversityState + ", affiliatedUniversityBoardName="
				+ affiliatedUniversityBoardName + ", yearAdmissionStarted=" + yearAdmissionStarted
				+ ", universityAffiliationCertificate=" + universityAffiliationCertificate
				+ ", instituteEstablishmentCertificate=" + instituteEstablishmentCertificate + ", addressLine1="
				+ addressLine1 + ", addressLine2=" + addressLine2 + ", instituteState=" + instituteState + ", district="
				+ district + ", city=" + city + ", pincode=" + pincode + ", institutePincode=" + institutePincode
				+ ", instituteHeadName=" + instituteHeadName + ", instituteHeadContact=" + instituteHeadContact
				+ ", appStatus=" + appStatus + ", login=" + login + "]";
	}
	
	
	
	

}
