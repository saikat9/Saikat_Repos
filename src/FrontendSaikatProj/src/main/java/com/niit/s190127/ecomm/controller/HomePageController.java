package com.niit.s190127.ecomm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.s190127.ecomm.dao.GenericDao;

@Controller
public class HomePageController {
	
	@Autowired
	GenericDao categoryDAO;

//Method to display login page
   @RequestMapping(value= {"/login","*/login"})
   public String loginPage()
   {
	   return "Login";
	   
   }
   
 //Method to display register page
   @RequestMapping(value= {"/register","*/register"})
   public String registerPage()
   {
	   return "Register";
	   
   }
   
 
   
 //Method to display aboutus page
   @RequestMapping(value= {"/aboutus","*/aboutus"})
   public String aboutusPage(Model aboutUs)
   {
	   //String p = "password@123";
	   //BCryptPasswordEncoder pe= new BCryptPasswordEncoder();
	   //String encPassword =pe.encode(p);
	   //System.out.println(encPassword);
		List<Object> categoryList = categoryDAO.listing();
		aboutUs.addAttribute("categoryList", categoryList);	   
	    return "AboutUs";
	   
   }   
   
   //Method to display contact us page
   @RequestMapping(value= {"/contactus","*/contactus"})
   public String contactusPage(Model contactUs)
   {
	   List<Object> categoryList = categoryDAO.listing();
	   contactUs.addAttribute("categoryList", categoryList);	 	   
	   return "ContactUs";
	   
   } 
}