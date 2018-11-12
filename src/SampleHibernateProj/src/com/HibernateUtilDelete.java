package com;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtilDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Configuration config=new Configuration();
			
			config.configure("hibernate.cfg.xml");
			
			SessionFactory sessionFactory=config.buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			Product product=(Product) session.get(Product.class,"P1002");
			
			product.setPrice(7500);
			
			session.delete(product);
			
			transaction.commit();
			
			session.close();
			
			System.out.println("Object is Deleted");
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}

}
