package com.Inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
	
		System.out.println("_____________________START________________________");
		
		Payment p = new Payment();
		p.setAmount(1000);
		
		Card c = new Card();
		c.setAmount(5000);
		c.setCardNO(12345678);
		c.setCardType("VISA");
		
		Cheque q = new Cheque();
		q.setAmount(10000);
		q.setChequeNo(10);
		q.setChequeType("saving");
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(p);
		session.persist(c);
		session.persist(q);
		
		tx.commit();
		session.close();
		factory.close();
		System.out.println("_____________________END_____________________");
	}

}
