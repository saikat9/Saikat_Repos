package com.niit.s190127.ecomm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.niit.s190127.ecomm.dao.GenericDao;
import com.niit.s190127.ecomm.model.Product;

@Controller
public class ProductController {

	@Autowired
	GenericDao productDAO;
	
	//Method to display existing products
	@RequestMapping(value={"/listproducts","*/listproducts"})
	public String displayProduct(Model productModel)
	{
		List<Object> productList=productDAO.listing();
		productModel.addAttribute("productList", productList);
		Product product=new Product();
		productModel.addAttribute("product", product);
		return "Product";
		
	}
	
	//Method to add product from user input
	@RequestMapping(value= {"/includeproduct","*/includeproduct"},method=RequestMethod.POST)
    public String insertProduct(@ModelAttribute("product")Product product,Model productModel)
    {
		productDAO.addition(product);
		Product product1=new Product();
		productModel.addAttribute("product", product1);
		List<Object> productList=productDAO.listing();
		productModel.addAttribute("productList", productList);
		return "Product";
    }	
}
