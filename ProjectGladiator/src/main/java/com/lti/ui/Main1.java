package com.lti.ui;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.StudentDetails;
import com.lti.model.StudentLogin;
import com.lti.model.StudentRegistrationDetails;

public class Main1 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager=factory.createEntityManager();
		
		StudentRegistrationDetails s1=new StudentRegistrationDetails();
		s1.setStudentAadharNo("444412579871");
		s1.setStudentName("Snayasish Kumar");
		s1.setStudentGender("Male");
		s1.setStudentMobile("8597586252");
		s1.setStudentInstitution("Netaji Subhash Engineering College");
		s1.setStudentDob(new Date(1997,11,7));
		
		
		
		StudentDetails app1= new StudentDetails();
		app1.setState("West Bengal");
		app1.setDistrict("UTAH");
		app1.setBlock("E Block");
		app1.setStreetNo(101);
		app1.setHouseNo(9);
		app1.setPinCode(700092);
		app1.setTuitionFee(600000.00);
		app1.setAdmissionFee(70000.0);
		app1.setOtherFee(10000);
		app1.setBankName("Standard Chartered Bank");
		app1.setBankAccountNo(222567568);
		app1.setBankIfscCode(180097621);
		app1.setStudentReligion("Hindu");
		app1.setStudentCategory("General");
		app1.setStudentFatherName("Gautam Kumar");
		app1.setStudentMotherName("Jharna Kumar");
		app1.setStudentFamilyAnnualIncome(100000);
		app1.setStudentCourse("Btech");
		app1.setStudentYear(2020);
		app1.setModeOfStudy("ClassRoom Program");
		app1.setStudentCourseStartDate(new Date(2016,7,11));
		app1.setStudentPreviousCourse("No Course before this");
		app1.setStudentPreviousPassingYear(2020);
		app1.setStudentPreviousPercentage(83.6);
		app1.setStudent10RollNumber(1519605);
		app1.setStudent10BoardName("CBSE");
		app1.setStudent10PassingYear(2013);
		app1.setStudent10Percentage(92.00);
		app1.setStudent12RollNumber(16109087);
		app1.setStudent12BoardName("CBSE");
		app1.setStudent12PassingYear(2015);
		app1.setStudent12Percentage(85.00);
		app1.setDisability("NO");
		app1.setDisabilityType("No disability");
		app1.setDisabilityPercentage(0.0);
		app1.setStudentMaritalStatus("Unmarried");
		app1.setParentProfession(" JCO at Indian Army");
		app1.setDomicileCertificate("To be uploaded");
		app1.setStudentPhotograph("To be uploaded");
		app1.setInstituteIdCard("Id card to be Uploaded");
		app1.setIncomeCertificate("to verify your category");
		app1.setPreviousYearMarksheet("To be Uploaded");
		app1.setBankPassbook("To be uploaded");
		app1.setFeeReceipt("To be uploaded");
		app1.setAadharCard("To be uploaded");
		app1.setMarkSheet10("To be Uploaded");
		app1.setMarkSheet12("To be Uploaded");
		app1.setScholarshipType("POST MATRIC SCHOLARSHIP");
		//app1.setStudentAddress(app1.getBlock()+ " "+app1.getStreetNo()+"  "+ app1.getHouseNo() +" "+app1.getDistrict());
		
		app1.setRegistration(s1);
	
		
		StudentLogin l1=new StudentLogin("Snayasishkmr@gmail.com","abcd1234");
		s1.setLogin(l1);
		
		Set<StudentDetails> application=new HashSet<>();
		application.add(app1);  //application 1 Added Successfully

		s1.setApplication(application);
		
		entityManager.getTransaction().begin();
		entityManager.persist(l1);
		entityManager.persist(s1);
		entityManager.persist(app1);
		entityManager.getTransaction().commit();
		
	}

}
