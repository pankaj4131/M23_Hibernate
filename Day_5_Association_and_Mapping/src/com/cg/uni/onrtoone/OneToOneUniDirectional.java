package com.cg.uni.onrtoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//program on OneToOne Unidirectional
public class OneToOneUniDirectional {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Student s=new Student();
		s.setRollno(101);
		s.setName("Pankaj");
		s.setPercentage(85.30f);
		
		Address a=new Address();
		a.setStreetno(12);
		a.setArea("Hadapsar");
		a.setCity("Pune");
		a.setState("Maharashtra");
		
		s.setAddress(a);
		
		em.persist(s);
		
		System.out.println("Rows Is Inserted");
		
		em.getTransaction().commit();
		em.close();
		factory.close();

		
		

	}

}