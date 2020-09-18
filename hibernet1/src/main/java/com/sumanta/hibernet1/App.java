package com.sumanta.hibernet1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
    	StandardServiceRegistry ss = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    	Metadata meta = new MetadataSources(ss).getMetadataBuilder().build();
    	SessionFactory factory=meta.getSessionFactoryBuilder().build();
    	Session session =factory.openSession();
    	Transaction t=session.beginTransaction();
    	Student s = new Student();
    	s.setFname("Sumanta");
    	s.setLname("maji");
    	
    	Student s1=new Student();
    	s1.setFname("AKASH");
    	s1.setLname("DUTTA");
    	
    	Student s2=new Student();
    	s2.setFname("ANKITA");
    	s2.setLname("KILLER");
    	Student s3=new Student();
    	s3.setFname("amit");
    	s3.setLname("sayani");
    	
    	Student s4=new Student();
    	s4.setFname("Sudeep");
    	s4.setLname("Mukherjee");
    	
    	session.save(s);
    	session.save(s1);
    	session.save(s2);
    	session.save(s3);
    	session.save(s4);
    	t.commit();
    	session.close();
    	factory.close();
    	System.out.println("data added");
    }
}
