 package com.niit.s190127.ecomm.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.s190127.ecomm.dao.GenericDao;
import com.niit.s190127.ecomm.model.CartItem;

public class CartItemDAOJunitTesting {
	static GenericDao cartItemDAO;

	@BeforeClass
	public static void runFirst()
	{
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.niit.s190127.ecomm");
		context.refresh();
		
		cartItemDAO=(GenericDao)context.getBean("cartItemDAO");
		
		
	}
	

	//Test case to check add method of cartItemdao class
	@Ignore
	@Test
	public void additionCartItemTest()
	{
		CartItem cartItem=new CartItem();
		cartItem.setCategoryDesc("Furniture to decorate home");
		cartItem.setCategoryId(1);
		cartItem.setCategoryName("Furniture");
		cartItem.setPrice(1000);
		cartItem.setProductDesc("teakwood bed");
		cartItem.setProductName("bed");
		cartItem.setSupplierAddr("Kolkata");
		cartItem.setSupplierId(1);
		cartItem.setSupplierName("Sen furniture");
		assertTrue("Problem in Adding the cartItem",cartItemDAO.addition(cartItem));
		
	}
	
	//Test case to check update method of cartItemdao class
	@Ignore
	@Test
	public void updationCartItemTest()
	{
		CartItem cartItem= (CartItem)cartItemDAO.retrieval(29);
		cartItem.setCategoryDesc("Furniture to decorate office");
		assertTrue("Problem in updating cartItem",cartItemDAO.updation(cartItem));
		
	}
	
	//Test case to check get method of cartItemdao class
	@Ignore
	@Test
	public void retrievalCartItemTest()
	{
		CartItem cartItem= (CartItem)cartItemDAO.retrieval(29);
		System.out.println("CartitemId:"+cartItem.getCartitemId());
		System.out.println("CategoryDesc:"+cartItem.getCategoryDesc());
		System.out.println("CategoryId:"+cartItem.getCategoryId());
		System.out.println("CategoryName:"+cartItem.getCategoryName());
		System.out.println("Price:"+cartItem.getPrice());
		System.out.println("ProductDesc:"+cartItem.getProductDesc());
		System.out.println("ProductName:"+cartItem.getProductName());
		System.out.println("SupplierAddr:"+cartItem.getSupplierAddr());
		System.out.println("SupplierId:"+cartItem.getSupplierId());
		System.out.println("SupplierName:"+cartItem.getSupplierName());
		assertTrue("Problem in retrieving cartItem",(cartItem!=null));
		
	}
	
	//Test case to check delete method of cartItem dao class
	
	@Test
	public void deletionCartItemTest()
	{
		CartItem cartItem= (CartItem)cartItemDAO.retrieval(29);
		assertTrue("Problem in deleting cartItem",cartItemDAO.deletion(cartItem));
		
	}
	
	
	
	//Test case to check listcartItem method of cartItem dao class
	@Ignore
	@Test
	public void listingCartItemsTest()
	{
		List<Object> listCartItems = cartItemDAO.listing();
		
		assertTrue("Problem in listing CartItems",listCartItems.size()>0);
		
		for(Object obj: listCartItems)
		{
			CartItem cartItem=(CartItem) obj;
			System.out.print("CartitemId:"+cartItem.getCartitemId());
			System.out.print("CategoryDesc:"+cartItem.getCategoryDesc());
			System.out.print("CategoryId:"+cartItem.getCategoryId());
			System.out.print("CategoryName:"+cartItem.getCategoryName());
			System.out.print("Price:"+cartItem.getPrice());
			System.out.print("ProductDesc:"+cartItem.getProductDesc());
			System.out.print("ProductName:"+cartItem.getProductName());
			System.out.print("SupplierAddr:"+cartItem.getSupplierAddr());
			System.out.print("SupplierId:"+cartItem.getSupplierId());
			System.out.println("SupplierName:"+cartItem.getSupplierName());
		}
		
	}
	
  
    

}
