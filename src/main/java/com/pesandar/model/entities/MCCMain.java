package com.pesandar.model.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MCCMain {

	public static void main(String[] args) {
		MedicalCheckCenter mcc=new MedicalCheckCenter();
		mcc.setPart("Head");
		mcc.setDuration("2minutes");
		mcc.setSideaffect("99.999 % safe");
		mcc.setCost("$ 4000");
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("GithubTesting");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(mcc);
		em.getTransaction().commit();
		em.close();
	}

}
