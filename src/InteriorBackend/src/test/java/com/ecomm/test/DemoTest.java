package com.ecomm.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoTest {

	//Simple class file to manually test db config file
	public static void main(String[] args) {
		
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
      context.scan("com.ecomm");
      context.refresh();
      context.close();
	}

}
