package com.niit.s190127.ecomm.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.s190127.ecomm.dao.CartItemDao;
import com.niit.s190127.ecomm.dao.CustomerOrderDao;
import com.niit.s190127.ecomm.dao.GenericDao;
import com.niit.s190127.ecomm.dao.UserDetailDao;
import com.niit.s190127.ecomm.model.CartItem;
import com.niit.s190127.ecomm.model.CustomerOrder;
import com.niit.s190127.ecomm.model.UserDetail;

@Controller
public class ProcessOrderController 
{
	@Autowired
	CartItemDao cartItemDAO;
	@Autowired
	CustomerOrderDao customerOrderDAO;
	@Autowired
	UserDetailDao userDetailDAO;
	@Autowired
	GenericDao categoryDAO;	

	//Method to process customer order
	@RequestMapping(value="/orderprocessing",method=RequestMethod.POST)
	public String processOrder(@RequestParam("paymentMode")String paymentMode,Model orderModel,HttpSession session)
	{
		String userName=(String) session.getAttribute("username");
		List<CartItem> listCartItems = cartItemDAO.listCartItems(userName);
		CustomerOrder customerOrder=new CustomerOrder();
		customerOrder.setUserName(userName);
		customerOrder.setDateOfOrder(new Date());
		customerOrder.setPaymentMode(paymentMode);
		customerOrder.setOrderPrice(this.cartPriceSum(listCartItems));
		if(customerOrderDAO.updateCartStatus(userName))
		{
		   customerOrderDAO.orderProcess(customerOrder);
		   orderModel.addAttribute("listCartItems", listCartItems);
		   orderModel.addAttribute("customerOrder", customerOrder);
		   UserDetail userDetail=userDetailDAO.fetchUser(userName);
		   orderModel.addAttribute("userDetail",userDetail);
		}
		List<Object> categoryList = categoryDAO.listing();
		orderModel.addAttribute("categoryList", categoryList);			
		return "PaymentReceipt";
	}
	
	//Calculate total price of cart items
	public int cartPriceSum(List<CartItem> listCartItems)
	{
		int totalPrice=0; 
		int counter=0;
		while (counter<listCartItems.size()) 
		{
			
			CartItem cartItem=listCartItems.get(counter);
			totalPrice=totalPrice+(cartItem.getQuantity()*cartItem.getPrice());
			counter++;
		}
		return totalPrice;
	}
}
