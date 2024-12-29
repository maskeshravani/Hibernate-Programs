package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vehicle.Vehicle;

public class exampleDemo {

	public static void main(String[] args) {
		
			Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        cfg.addAnnotatedClass(Example.class);

	        SessionFactory sf = cfg.buildSessionFactory();
	        Session ss = sf.openSession();
	        Transaction tr = ss.beginTransaction();

	        Vehicle v = new Vehicle();
	        System.out.println("Application is Started...");

	}

}
