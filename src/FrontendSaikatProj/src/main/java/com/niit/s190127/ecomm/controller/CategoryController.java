package com.niit.s190127.ecomm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.s190127.ecomm.dao.GenericDao;

@Controller
public class CategoryController {
	

	@Autowired
	GenericDao categoryDAO;
	

	@RequestMapping(value="/listcategories")
    public String displayCategory()
    {

		
		return "Category";
    }
	
	
}	