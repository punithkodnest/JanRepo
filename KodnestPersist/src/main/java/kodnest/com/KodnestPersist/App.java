package kodnest.com.KodnestPersist;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

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
         
         
         
    //	User obj1=new User("789", "Bharadwaj","2500000","bharadwaj789", "bharadwaj@bharad.com", "7896541230");
    	
    	session.beginTransaction();
    	//For insert
    	//session.persist(obj1);
    	
    	//for update
    	//String accno="321";
    	//User obj1= (User) session.get(User.class, accno);
    	//obj1.setEmail("prahhallad@kodnest,com");
    	//session.update(obj1);
    	
    	String accno="789";
    	User obj1= (User) session.get(User.class, accno);
    	
    	session.delete(obj1);
    	session.getTransaction().commit();
    	
    }
}
