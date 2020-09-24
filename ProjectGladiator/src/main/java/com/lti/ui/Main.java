/*package com.lti.ui;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.StudentDetails;
import com.lti.model.StudentLogin;
import com.lti.model.StudentRegistrationDetails;

public class Main {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager=factory.createEntityManager();
		
		StudentRegistrationDetails s1=new StudentRegistrationDetails("Snayasish Kumar","male","9627480989","NSEC","222433345555");
		StudentDetails app1= new StudentDetails("Kolkata",2500.0,12345678,"Merit");
		app1.setRegistration(s1);
		
		StudentDetails app2= new StudentDetails("Delhi",2500.0,12345678,"Girls");
		app2.setRegistration(s1);
		
		StudentLogin l1=new StudentLogin("Snayasishkmr@gmail.com","abcd1234");
		s1.setLogin(l1);
		
		Set<StudentDetails> application=new HashSet<>();
		application.add(app1);
		application.add(app2);
		
		s1.setApplication(application);
		
		
		entityManager.getTransaction().begin();
		entityManager.persist(l1);
		entityManager.persist(s1);
		entityManager.persist(app1);
		entityManager.persist(app2);
		entityManager.getTransaction().commit();
		
	}

}*/
