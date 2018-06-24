package com.pesandar.model.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MCCMain {

	public static void main(String[] args) {
		MedicalCheckCenter mcc1 = new MedicalCheckCenter();
		mcc1.setPart("Heart");
		mcc1.setDuration("5minutes");
		mcc1.setSideaffect("89.999 % safe");
		mcc1.setCost("$ 900");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("GithubTesting");
		EntityManager em = emf.createEntityManager();
		MedicalCheckCenter mcc=em.find(MedicalCheckCenter.class,1);
		em.getTransaction().begin();
	
		mcc.setPart("Excretory System");
		em.persist(mcc1);
		em.remove(mcc);
		/*System.out.println(mcc.getPart());
		System.out.println(mcc.getDuration());
		System.out.println(mcc.getSideaffect());
		System.out.println(mcc.getCost());*/
		em.getTransaction().commit();
		em.close();
	}

}
