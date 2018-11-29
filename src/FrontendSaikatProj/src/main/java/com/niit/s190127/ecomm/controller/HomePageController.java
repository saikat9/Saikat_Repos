package com.niit.s190127.ecomm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

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
   public String aboutusPage()
   {
	   return "AboutUs";
	   
   }   
   

}