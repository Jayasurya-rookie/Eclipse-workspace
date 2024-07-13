package com.kodnest;
//package com.kodnest.entity;

import java.util.ArrayList;

import org.hibernate.Session;

//import org.hibernate.Session;

//import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodnest.entity.Customer;
import com.kodnest.entity.Product;


public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        try {
        	
        //being transaction
        Transaction tr = session.beginTransaction();
//        Product product = new Product();
        
//        Product p1 = new Product();
//        p1.setPid(11);
//        p1.setPname("tony11");
//        session.save(p1);
        Product p2 = new Product();
        p2.setPid(22);
        p2.setPname("stark22");
        session.save(p2);
        Product p3 = new Product();
        p3.setPid(45);
        p3.setPname(null);
        session.save(p3);
        
        
        ArrayList<Product> al = new ArrayList<Product>();
        al.add(p2);
        al.add(p3);
//        Product product = new Product();
//        session.save(product);
        Customer c1 = new Customer();
        c1.setCid(7);
        c1.setCname("vamp");
        session.save(c1);
        Customer c2 = new Customer();
        c2.setCid(11);
        c2.setCname("vamp");
        session.save(c2);
        
       
        ArrayList<Customer> cl = new ArrayList<Customer>();
        cl.add(c1);
        cl.add(c2);
        
       
        Customer cu = new Customer(11,"Hulk",al);
      
        session.save(cu);
       
        tr.commit();
        
        }
        catch(Exception e) {
        	e.printStackTrace();
        	
        }
        finally {
        	 session.close();
             factory.close();
        }
       
        
        
        
        
        
        

//        Product p = new Product();
//        Customer c = new Customer(1,"john",p);
//        
//        p.setPid(120);
//        
//        p.setPname("si");
//        session.save(c);
//        session.save(p);
//        tr.commit();
        
        
//        Product p = new Product(1,"Pod1");
//        session.save(p);
//        Customer c = new Customer(1,"haidhhx",p);
//        session.save(c);
//        tr.commit();
//        session.close();
//        factory.close();
//        System.out.println(session+"success");
        
//        Bike bike = new Bike("KTM",3);
//        session.save(bike);
//        Student student = new Student(1,"ja",bike);
//        session.save(student);
//        tr.commit();
//        session.close();
//        factory.close();
        
//        Student s =session.get(Student.class,1);
//        System.out.println(s.toString());
//         session.save(s);
//        System.out.println(s.getId()+"****"+s.getName());
//        tr.commit();

//        Student s = new Student(2,"jack");
//        session.save(s);
//        tr.commit();
        
        
        
//         Bike b = new Bike("KTM",3999.0);
//         session.save(b);
//        Bike b = new Bike("KTM",50430);
//        session.update(b);
        
//         Student s = new Student(2,"joe");
//         session.delete(s);
//         tr.commit();
        
//        System.out.println(session+"success");
        
    }
}
