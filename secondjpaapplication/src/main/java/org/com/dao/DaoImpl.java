package org.com.dao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.com.entity.*;

import jakarta.persistence.Persistence;
public class DaoImpl implements Dao {
	EntityManagerFactory ef=  Persistence.createEntityManagerFactory("test1");
	public void saveStudent(Student s) {
	EntityManager em=ef.createEntityManager();
	EntityTransaction t1=em.getTransaction();

	EntityTransaction t2=em.getTransaction();
try {
		t1.begin();
		em.persist(s);
		System.out.println("insertion successfull..!!");
		t1.commit();
		
		
	}
	catch(Exception e) {
		e.printStackTrace();
		
	}
	finally {
		em.close();
	}
}
}
