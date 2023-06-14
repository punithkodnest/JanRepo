package com.kodnest.Hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	 Configuration configuration = new Configuration();
         configuration.configure("hibernate.cfg.xml");
         StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                 .applySettings(configuration.getProperties())
                 .build();
         SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
         Session session=sessionFactory.openSession();
         
         
         
    	User obj1=new User("789", "Bharadwaj","2500000","bharadwaj789", "bharadwaj@bharad.com", "7896541230");
    	
    	session.beginTransaction();
    	session.persist(obj1);
    	session.getTransaction().commit();
    	
    	   	
    }
}
