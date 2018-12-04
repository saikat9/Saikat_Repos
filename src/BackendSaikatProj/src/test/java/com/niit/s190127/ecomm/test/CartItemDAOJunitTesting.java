 package com.niit.s190127.ecomm.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.s190127.ecomm.dao.CartItemDao;
import com.niit.s190127.ecomm.model.CartItem;

public class CartItemDAOJunitTesting {
	static CartItemDao cartItemDAO;

	@BeforeClass
	public static void runFirst()
	{
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.niit.s190127.ecomm");
		context.refresh();
		
		cartItemDAO=(CartItemDao) context.getBean("cartItemDAO");
		
		
	}
	

	//Test case to check add/update method of cartItemdao class
	
	@Test
	public void ammendCartItemTest()
	{
		CartItem cartItem=new CartItem();
		cartItem.setProductId(1);
		cartItem.setQuantity(1);
		cartItem.setPrice(1000);
		cartItem.setProductName("bed");
		cartItem.setStatus("active");
		cartItem.setUserName("Kris");
		assertTrue("Problem in Adding the cartItem",cartItemDAO.amendCartItem(cartItem));
		
	}
	

	
	//Test case to check get method of cartItemdao class
	@Ignore
	@Test
	public void retrievalCartItemTest()
	{

	
		
	}
	
	//Test case to check delete method of cartItem dao class
	@Ignore
	@Test
	public void deletionCartItemTest()
	{
	
		
	}
	
	
	
	//Test case to check listcartItem method of cartItem dao class
	@Ignore
	@Test
	public void listingCartItemsTest()
	{

		
	}
	
  
    

}
