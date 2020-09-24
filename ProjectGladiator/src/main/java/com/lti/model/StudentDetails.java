package com.lti.model;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


//*******************************************Column declaration Here**********************************************************************
@Entity
@Table(name = "STUDENT_DETAILS")
public class StudentDetails implements Serializable{
	@Id
	@Column(name = "STUDENT_APPLICATION_NO")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long studentApplicationNo;
	
	@Column(name ="STUDENT_STATE")
	private String state;
	
	@Column(name="DISTRICT")
	private String district;

	@Column(name="BLOCK")
	private String block;
	
	@Column(name="STREET_NO")
	private long streetNo;
	
	@Column(name="HOUSE_NO")
	private long houseNo;
	
	@Column(name="PINCODE")
	private long pinCode;
	
	@Column(name = "TUITION_FEE")
	private Double tuitionFee;
	
	@Column(name="ADMISSION_FEE")
	private double admissionFee;
	
	@Column(name="OTHER_FEE")
	private double otherFee;
	
	@Column(name="BANK_NAME")
	private String bankName;
	
	@Column(name = "BANK_ACCOUNT_NO")
	private long bankAccountNo;
	
	@Column(name="BANK_IFSC_CODE")
	private long bankIfscCode;
	
	@Column(name="STUDENT_RELIGION")
	private String studentReligion;
	
	@Column(name="STUDENT_CATEGORY")
	private String studentCategory;
	
	@Column(name="STUDENT_FATHER_NAME")
	private String studentFatherName;
	
	@Column(name="STUDENT_MOTHER_NAME")
	private String studentMotherName;
	
	@Column(name="STUDENT_FAMILY_ANNUAL_INCOME")
	private long studentFamilyAnnualIncome;
	
	@Column(name="STUDENT_COURSE")
	private String studentCourse;
	
	@Column(name="STUDENT_YEAR")
	private long studentYear;
	
	@Column(name="MODE_OF_STUDY")
	private String modeOfStudy;
	
	@Column(name="STUDENT_COURSE_START_DATE")
	private Date studentCourseStartDate;
	
	@Column(name="STUDENT_PREVIOUS_COURSE")
	private String studentPreviousCourse;
	
	@Column(name="STUDENT_PREVIOUS_PASSING_YEAR")
	private long studentPreviousPassingYear;
	
	@Column(name="STUDENT_PREVIOUS_PERCENTAGE")
	private double studentPreviousPercentage;
	
	@Column(name="STUDENT_10_ROLL_NUMBER")
	private long student10RollNumber;
	
	@Column(name="STUDENT_10_BOARD_NAME")
	private String student10BoardName;

	@Column(name="STUDENT_10_PASSING_YEAR")
	private int student10PassingYear;
	
	@Column(name="STUDENT_10_PERCENTAGE") 
	private double student10Percentage;
	
	@Column(name="STUDENT_12_ROLL_NUMBER")
	private long student12RollNumber;
	
	@Column(name="STUDENT_12_BOARD_NAME")
	private String student12BoardName;

	@Column(name="STUDENT_12_PASSING_YEAR")
	private int student12PassingYear;
	
	@Column(name="STUDENT_12_PERCENTAGE") 
	private double student12Percentage;
	
	@Column(name="DISABILITY")
	private String disability;  
	
	@Column(name="DISABILITY_TYPE")
	private String disabilityType;
	
	@Column(name="DISABILITY_PERCENTAGE")
	private double disabilityPercentage;
	
	@Column(name="STUDENT_MARITAL_STATUS")
	private String studentMaritalStatus;
	
	@Column(name="PARENT_PROFESSION")
	private String parentProfession;
	
	@Column(name="DOMICILE_CERTIFICATE")
	private String domicileCertificate;
	
	@Column(name="STUDENT_PHOTOGRAPH")
	private String studentPhotograph;
	
	@Column(name="INSTITUTE_ID_CARD")
	private String instituteIdCard;
	
	@Column(name="INCOME_CERTIFICATE")
	private String incomeCertificate;  
	
	@Column(name="PREVIOUS_YEAR_MARKSHEET")
	private String previousYearMarksheet;
	
	@Column(name="BANK_PASSBOOK")
	private String bankPassbook;
	
	@Column(name="FEE_RERCEIPT")
	private String feeReceipt;
	
	@Column(name="AADHAR_CARD")
	private String aadharCard;
	
	@Column(name="MARK_SHEET_10")
	private String markSheet10;
	
	@Column(name="MARK_SHEET_12")
	private String markSheet12;
	
	@Column(name = "SCHOLARSHIP_TYPE")
	private String scholarshipType; 

	@ManyToOne
	@JoinColumn(name="STUDENT_AADHAR_NO")
	private StudentRegistrationDetails registration;
	
	@ManyToOne
	@JoinColumn(name = "INSTITUTE_CODE")
	private InstitueLogin institute;
	
	@OneToOne
	@JoinColumn(name = "STUDENT_AADHAR_NO")
	private StudentApplicationStatus status;
	
	//********************************Default Constructor *******************************************************************
	public StudentDetails()
	{
		
	}
	
	
	//**************************** Generating Constructors Using Fields******************************************************

	public StudentDetails(long studentApplicationNo,String state, String district, String block,
			long streetNo, long houseNo, long pinCode, Double tuitionFee, double admissionFee, double otherFee,
			String bankName, long bankAccountNo, long bankIfscCode, String studentReligion, String studentCategory,
			String studentFatherName, String studentMotherName, long studentFamilyAnnualIncome, String studentCourse,
			long studentYear, String modeOfStudy, Date studentCourseStartDate, String studentPreviousCourse,
			long studentPreviousPassingYear, double studentPreviousPercentage, long student10RollNumber,
			String student10BoardName, int student10PassingYear, double student10Percentage, long student12RollNumber,
			String student12BoardName, int student12PassingYear, double student12Percentage, String disability,
			String disabilityType, double disabilityPercentage, String studentMaritalStatus, String parentProfession,
			String domicileCertificate, String studentPhotograph, String instituteIdCard, String incomeCertificate,
			String previousYearMarksheet, String bankPassbook, String feeReceipt, String aadharCard, String markSheet10,
			String markSheet12, String scholarshipType, StudentRegistrationDetails registration) {
		super();
		this.studentApplicationNo = studentApplicationNo;
		this.state = state;
		this.district = district;
		this.block = block;
		this.streetNo = streetNo;
		this.houseNo = houseNo;
		this.pinCode = pinCode;
		this.tuitionFee = tuitionFee;
		this.admissionFee = admissionFee;
		this.otherFee = otherFee;
		this.bankName = bankName;
		this.bankAccountNo = bankAccountNo;
		this.bankIfscCode = bankIfscCode;
		this.studentReligion = studentReligion;
		this.studentCategory = studentCategory;
		this.studentFatherName = studentFatherName;
		this.studentMotherName = studentMotherName;
		this.studentFamilyAnnualIncome = studentFamilyAnnualIncome;
		this.studentCourse = studentCourse;
		this.studentYear = studentYear;
		this.modeOfStudy = modeOfStudy;
		this.studentCourseStartDate = studentCourseStartDate;
		this.studentPreviousCourse = studentPreviousCourse;
		this.studentPreviousPassingYear = studentPreviousPassingYear;
		this.studentPreviousPercentage = studentPreviousPercentage;
		this.student10RollNumber = student10RollNumber;
		this.student10BoardName = student10BoardName;
		this.student10PassingYear = student10PassingYear;
		this.student10Percentage = student10Percentage;
		this.student12RollNumber = student12RollNumber;
		this.student12BoardName = student12BoardName;
		this.student12PassingYear = student12PassingYear;
		this.student12Percentage = student12Percentage;
		this.disability = disability;
		this.disabilityType = disabilityType;
		this.disabilityPercentage = disabilityPercentage;
		this.studentMaritalStatus = studentMaritalStatus;
		this.parentProfession = parentProfession;
		this.domicileCertificate = domicileCertificate;
		this.studentPhotograph = studentPhotograph;
		this.instituteIdCard = instituteIdCard;
		this.incomeCertificate = incomeCertificate;
		this.previousYearMarksheet = previousYearMarksheet;
		this.bankPassbook = bankPassbook;
		this.feeReceipt = feeReceipt;
		this.aadharCard = aadharCard;
		this.markSheet10 = markSheet10;
		this.markSheet12 = markSheet12;
		this.scholarshipType = scholarshipType;
		this.registration = registration;
	}
	
	
	//********************************************Generating getters and Setters***********************************************************************************

	

	public long getStudentApplicationNo() {
		return studentApplicationNo;
	}


	public void setStudentApplicationNo(long studentApplicationNo) {
		this.studentApplicationNo = studentApplicationNo;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getBlock() {
		return block;
	}


	public void setBlock(String block) {
		this.block = block;
	}


	public long getStreetNo() {
		return streetNo;
	}


	public void setStreetNo(long streetNo) {
		this.streetNo = streetNo;
	}


	public long getHouseNo() {
		return houseNo;
	}


	public void setHouseNo(long houseNo) {
		this.houseNo = houseNo;
	}


	public long getPinCode() {
		return pinCode;
	}


	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}


	public Double getTuitionFee() {
		return tuitionFee;
	}


	public void setTuitionFee(Double tuitionFee) {
		this.tuitionFee = tuitionFee;
	}


	public double getAdmissionFee() {
		return admissionFee;
	}


	public void setAdmissionFee(double admissionFee) {
		this.admissionFee = admissionFee;
	}


	public double getOtherFee() {
		return otherFee;
	}


	public void setOtherFee(double otherFee) {
		this.otherFee = otherFee;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public long getBankAccountNo() {
		return bankAccountNo;
	}


	public void setBankAccountNo(long bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}


	public long getBankIfscCode() {
		return bankIfscCode;
	}


	public void setBankIfscCode(long bankIfscCode) {
		this.bankIfscCode = bankIfscCode;
	}


	public String getStudentReligion() {
		return studentReligion;
	}


	public void setStudentReligion(String studentReligion) {
		this.studentReligion = studentReligion;
	}


	public String getStudentCategory() {
		return studentCategory;
	}


	public void setStudentCategory(String studentCategory) {
		this.studentCategory = studentCategory;
	}


	public String getStudentFatherName() {
		return studentFatherName;
	}


	public void setStudentFatherName(String studentFatherName) {
		this.studentFatherName = studentFatherName;
	}


	public String getStudentMotherName() {
		return studentMotherName;
	}


	public void setStudentMotherName(String studentMotherName) {
		this.studentMotherName = studentMotherName;
	}


	public long getStudentFamilyAnnualIncome() {
		return studentFamilyAnnualIncome;
	}


	public void setStudentFamilyAnnualIncome(long studentFamilyAnnualIncome) {
		this.studentFamilyAnnualIncome = studentFamilyAnnualIncome;
	}


	public String getStudentCourse() {
		return studentCourse;
	}


	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}


	public long getStudentYear() {
		return studentYear;
	}


	public void setStudentYear(long studentYear) {
		this.studentYear = studentYear;
	}


	public String getModeOfStudy() {
		return modeOfStudy;
	}


	public void setModeOfStudy(String modeOfStudy) {
		this.modeOfStudy = modeOfStudy;
	}


	public Date getStudentCourseStartDate() {
		return studentCourseStartDate;
	}


	public void setStudentCourseStartDate(Date studentCourseStartDate) {
		this.studentCourseStartDate = studentCourseStartDate;
	}


	public String getStudentPreviousCourse() {
		return studentPreviousCourse;
	}


	public void setStudentPreviousCourse(String studentPreviousCourse) {
		this.studentPreviousCourse = studentPreviousCourse;
	}


	public long getStudentPreviousPassingYear() {
		return studentPreviousPassingYear;
	}


	public void setStudentPreviousPassingYear(long studentPreviousPassingYear) {
		this.studentPreviousPassingYear = studentPreviousPassingYear;
	}


	public double getStudentPreviousPercentage() {
		return studentPreviousPercentage;
	}


	public void setStudentPreviousPercentage(double studentPreviousPercentage) {
		this.studentPreviousPercentage = studentPreviousPercentage;
	}


	public long getStudent10RollNumber() {
		return student10RollNumber;
	}


	public void setStudent10RollNumber(long student10RollNumber) {
		this.student10RollNumber = student10RollNumber;
	}


	public String getStudent10BoardName() {
		return student10BoardName;
	}


	public void setStudent10BoardName(String student10BoardName) {
		this.student10BoardName = student10BoardName;
	}


	public int getStudent10PassingYear() {
		return student10PassingYear;
	}


	public void setStudent10PassingYear(int student10PassingYear) {
		this.student10PassingYear = student10PassingYear;
	}


	public double getStudent10Percentage() {
		return student10Percentage;
	}


	public void setStudent10Percentage(double student10Percentage) {
		this.student10Percentage = student10Percentage;
	}


	public long getStudent12RollNumber() {
		return student12RollNumber;
	}


	public void setStudent12RollNumber(long student12RollNumber) {
		this.student12RollNumber = student12RollNumber;
	}


	public String getStudent12BoardName() {
		return student12BoardName;
	}


	public void setStudent12BoardName(String student12BoardName) {
		this.student12BoardName = student12BoardName;
	}


	public int getStudent12PassingYear() {
		return student12PassingYear;
	}


	public void setStudent12PassingYear(int student12PassingYear) {
		this.student12PassingYear = student12PassingYear;
	}


	public double getStudent12Percentage() {
		return student12Percentage;
	}


	public void setStudent12Percentage(double student12Percentage) {
		this.student12Percentage = student12Percentage;
	}


	public String getDisability() {
		return disability;
	}


	public void setDisability(String disability) {
		this.disability = disability;
	}


	public String getDisabilityType() {
		return disabilityType;
	}


	public void setDisabilityType(String disabilityType) {
		this.disabilityType = disabilityType;
	}


	public double getDisabilityPercentage() {
		return disabilityPercentage;
	}


	public void setDisabilityPercentage(double disabilityPercentage) {
		this.disabilityPercentage = disabilityPercentage;
	}


	public String getStudentMaritalStatus() {
		return studentMaritalStatus;
	}


	public void setStudentMaritalStatus(String studentMaritalStatus) {
		this.studentMaritalStatus = studentMaritalStatus;
	}


	public String getParentProfession() {
		return parentProfession;
	}


	public void setParentProfession(String parentProfession) {
		this.parentProfession = parentProfession;
	}


	public String getDomicileCertificate() {
		return domicileCertificate;
	}


	public void setDomicileCertificate(String domicileCertificate) {
		this.domicileCertificate = domicileCertificate;
	}


	public String getStudentPhotograph() {
		return studentPhotograph;
	}


	public void setStudentPhotograph(String studentPhotograph) {
		this.studentPhotograph = studentPhotograph;
	}


	public String getInstituteIdCard() {
		return instituteIdCard;
	}


	public void setInstituteIdCard(String instituteIdCard) {
		this.instituteIdCard = instituteIdCard;
	}


	public String getIncomeCertificate() {
		return incomeCertificate;
	}


	public void setIncomeCertificate(String incomeCertificate) {
		this.incomeCertificate = incomeCertificate;
	}


	public String getPreviousYearMarksheet() {
		return previousYearMarksheet;
	}


	public void setPreviousYearMarksheet(String previousYearMarksheet) {
		this.previousYearMarksheet = previousYearMarksheet;
	}


	public String getBankPassbook() {
		return bankPassbook;
	}


	public void setBankPassbook(String bankPassbook) {
		this.bankPassbook = bankPassbook;
	}


	public String getFeeReceipt() {
		return feeReceipt;
	}


	public void setFeeReceipt(String feeReceipt) {
		this.feeReceipt = feeReceipt;
	}


	public String getAadharCard() {
		return aadharCard;
	}


	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}


	public String getMarkSheet10() {
		return markSheet10;
	}


	public void setMarkSheet10(String markSheet10) {
		this.markSheet10 = markSheet10;
	}


	public String getMarkSheet12() {
		return markSheet12;
	}


	public void setMarkSheet12(String markSheet12) {
		this.markSheet12 = markSheet12;
	}


	public String getScholarshipType() {
		return scholarshipType;
	}


	public void setScholarshipType(String scholarshipType) {
		this.scholarshipType = scholarshipType;
	}


	public StudentRegistrationDetails getRegistration() {
		return registration;
	}
	
	public void setRegistration(StudentRegistrationDetails registration) {
		this.registration = registration;
	}


	public InstitueLogin getInstitute() {
		return institute;
	}


	public void setInstitute(InstitueLogin institute) {
		this.institute = institute;
	}


	public StudentApplicationStatus getStatus() {
		return status;
	}


	public void setStatus(StudentApplicationStatus status) {
		this.status = status;
	}
	
	//*************************************To string Method***********************************************

	@Override
	public String toString() {
		return "StudentDetails [studentApplicationNo=" + studentApplicationNo + ", state=" + state + ", district="
				+ district + ", block=" + block + ", streetNo=" + streetNo + ", houseNo=" + houseNo + ", pinCode="
				+ pinCode + ", tuitionFee=" + tuitionFee + ", admissionFee=" + admissionFee + ", otherFee=" + otherFee
				+ ", bankName=" + bankName + ", bankAccountNo=" + bankAccountNo + ", bankIfscCode=" + bankIfscCode
				+ ", studentReligion=" + studentReligion + ", studentCategory=" + studentCategory
				+ ", studentFatherName=" + studentFatherName + ", studentMotherName=" + studentMotherName
				+ ", studentFamilyAnnualIncome=" + studentFamilyAnnualIncome + ", studentCourse=" + studentCourse
				+ ", studentYear=" + studentYear + ", modeOfStudy=" + modeOfStudy + ", studentCourseStartDate="
				+ studentCourseStartDate + ", studentPreviousCourse=" + studentPreviousCourse
				+ ", studentPreviousPassingYear=" + studentPreviousPassingYear + ", studentPreviousPercentage="
				+ studentPreviousPercentage + ", student10RollNumber=" + student10RollNumber + ", student10BoardName="
				+ student10BoardName + ", student10PassingYear=" + student10PassingYear + ", student10Percentage="
				+ student10Percentage + ", student12RollNumber=" + student12RollNumber + ", student12BoardName="
				+ student12BoardName + ", student12PassingYear=" + student12PassingYear + ", student12Percentage="
				+ student12Percentage + ", disability=" + disability + ", disabilityType=" + disabilityType
				+ ", disabilityPercentage=" + disabilityPercentage + ", studentMaritalStatus=" + studentMaritalStatus
				+ ", parentProfession=" + parentProfession + ", domicileCertificate=" + domicileCertificate
				+ ", studentPhotograph=" + studentPhotograph + ", instituteIdCard=" + instituteIdCard
				+ ", incomeCertificate=" + incomeCertificate + ", previousYearMarksheet=" + previousYearMarksheet
				+ ", bankPassbook=" + bankPassbook + ", feeReceipt=" + feeReceipt + ", aadharCard=" + aadharCard
				+ ", markSheet10=" + markSheet10 + ", markSheet12=" + markSheet12 + ", scholarshipType="
				+ scholarshipType + ", registration=" + registration + "]";
	}


}
