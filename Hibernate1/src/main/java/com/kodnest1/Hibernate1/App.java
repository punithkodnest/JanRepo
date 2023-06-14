package com.kodnest1.Hibernate1;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class App {
  /**
 * @param args
 */
public static void main(String[] args) {

 	 Configuration configuration = new Configuration();
      configuration.configure("hibernate.cfg.xml");
      StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
              .applySettings(configuration.getProperties())
              .build();
      SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
      Session session=sessionFactory.openSession();
      session.beginTransaction();
      
      Query q=session.createQuery("From User");
	List<User> results = q.list();

	

	for (User user : results) {
	    System.out.println(user);
	}
      
  }
}
