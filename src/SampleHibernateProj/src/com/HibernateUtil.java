package com;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Configuration config=new Configuration();
			
			config.configure("hibernate.cfg.xml");
			
			SessionFactory sessionFactory=config.buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			com.Product product=new com.Product();
			
			product.setProductId("P1001");
			product.setProductName("Honor 9N");
			product.setPrice(10500);
			
			session.save(product);
			
			transaction.commit();
		    transaction=session.beginTransaction();
			
			product=new com.Product();
			product.setProductId("P1002");
			product.setProductName("Honor 9N");
			product.setPrice(10500);
			
			session.save(product);
			
			transaction.commit();
			
			session.close();
	
			
			System.out.println("Object is Saved");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured:"+e);
		}
	}

}
