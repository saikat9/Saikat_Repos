package com;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class HibernateQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Configuration config=new Configuration();
			
			config.configure("hibernate.cfg.xml");
			
			SessionFactory sessionFactory=config.buildSessionFactory();
			
			Session session=sessionFactory.openSession();
			
			Query query = session.createQuery("from Product");
			
			List<Product> listProducts=query.list();
			
			for(Product product:listProducts)
			{
				System.out.print(product.getProductId()+":::");
				System.out.print(product.getProductName()+":::");
				System.out.println(product.getPrice());
			}
			System.out.println("Where Condition in Query:");
       query = session.createQuery("from Product where productName=:prodname");
			
			query.setParameter("prodname", "Honor 9N");
			
	        listProducts=query.list();
			
			for(Product product:listProducts)
			{
				System.out.print(product.getProductId()+":::");
				System.out.print(product.getProductName()+":::");
				System.out.println(product.getPrice());
			}
			
			
			
			session.close();
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:");
		}
		
	}

}
