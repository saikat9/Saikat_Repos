package com.niit.s190127.ecomm.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.s190127.ecomm.model.CartItem;

@Repository("cartItemDAO")
@Transactional
public class CartItemDaoImpl implements GenericDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean addition(Object obj) {
		// Method to add cartItem
		
		try
		{
			
		sessionFactory.getCurrentSession().save(obj);
		return true;
		}
		catch(Exception ex)
		{
			return false;
		}
	}

	@Override
	public boolean deletion(Object obj) {
		// Method to delete cartItem
		
		try
		{
		sessionFactory.getCurrentSession().delete(obj);
		return true;
		}
		catch(Exception ex)
		{
			return false;
		}
	}

	@Override
	public boolean updation(Object obj) {
	// Method to update cartItem
		
		try
		{
		sessionFactory.getCurrentSession().update(obj);
		return true;
		}
		catch(Exception ex)
		{
			return false;
		}
	}

	@Override
	public Object retrieval(int Id) {
		// Method to get cartItem
		 
		Session session = sessionFactory.openSession();
		CartItem cartItem = session.get(CartItem.class, Id);
		session.close();
		return cartItem;
	}

	@Override
	public List<Object> listing() {
		// Method to get a list of cartItem
		 Session session = sessionFactory.openSession();
		 Query query = session.createQuery("from CartItem");
		 @SuppressWarnings("unchecked")
		 List<Object>  listCartItems = query.getResultList();
		 session.close();
		 return listCartItems;
	}

}
