package com.niit.s190127.ecomm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProcessOrderController 
{

	//Method to process customer order
	@RequestMapping("/orderprocessing")
	public String processOrder()
	{
		return "PaymentReceipt";
	}
}
