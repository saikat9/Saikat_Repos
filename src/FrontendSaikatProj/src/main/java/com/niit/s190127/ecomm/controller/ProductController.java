package com.niit.s190127.ecomm.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.niit.s190127.ecomm.dao.GenericDao;
import com.niit.s190127.ecomm.model.Category;
import com.niit.s190127.ecomm.model.Product;

@Controller
public class ProductController {

	@Autowired
	GenericDao productDAO;
	@Autowired
	GenericDao categoryDAO;
	
	//Method to display existing products
	@RequestMapping(value={"/listproducts","*/listproducts"})
	public String displayProduct(Model productModel)
	{
		List<Object> productList=productDAO.listing();
		productModel.addAttribute("productList", productList);
		Product product=new Product();
		productModel.addAttribute("product", product);
		productModel.addAttribute("categoryList", this.fetchCategoryList(categoryDAO.listing()));
		return "Product";
		
	}
	
	//Method to add product from user input
	@RequestMapping(value= {"/includeproduct","*/includeproduct"},method=RequestMethod.POST)
    public String insertProduct(@ModelAttribute("product")Product product,@RequestParam("pimage")MultipartFile productImage,Model productModel)
    {
		//Test code to display data starts here
		
		//Test code to display data ends here
		String path="C:\\Users\\DELL\\eclipse-workspace\\FrontendSaikatProj\\src\\main\\webapp\\resource\\images\\";
		path=path+String.valueOf(product.getProductName()+product.getProductId())+".jpg";
		File imageFile=new File(path);
		if(!productImage.isEmpty())
		{
			try
			{
				byte[] imageBuffer=productImage.getBytes();
				FileOutputStream fos=new FileOutputStream(imageFile);
				BufferedOutputStream bos=new BufferedOutputStream(fos);
				bos.write(imageBuffer);
				bos.close();
			}
			catch (Exception ex) {
				productModel.addAttribute("Error","Exception occured during product image upload"+ex);
			}
		}
		else {
			productModel.addAttribute("Error","Exception occured during product image upload");
		}
		productDAO.addition(product);
		Product product1=new Product();
		productModel.addAttribute("product", product1);
		List<Object> productList=productDAO.listing();
		productModel.addAttribute("productList", productList);
		productModel.addAttribute("categoryList", this.fetchCategoryList(categoryDAO.listing()));
		return "Product";
    }	
	
	//Method to display update product page
	@RequestMapping(value= {"/amendProduct/{productId}","*/amendProduct/{productId}"})
    public String amendProduct(@PathVariable("productId")int productId,Model productModel)
    {
		Product product=(Product)productDAO.retrieval(productId);
		productModel.addAttribute("product", product);
		List<Object> productList=productDAO.listing();
		productModel.addAttribute("productList", productList);
		productModel.addAttribute("categoryList", this.fetchCategoryList(categoryDAO.listing()));
		return "Product";		
		
    }
	
	//Method to delete product from product list
	@RequestMapping(value= {"/{productId}/removeProduct","*/{productId}/removeProduct"})
    public String removeProduct(@PathVariable("productId")int productId,Model productModel)
    {
		Product product=(Product)productDAO.retrieval(productId);
		productDAO.deletion(product);
		Product product1=new Product();
		productModel.addAttribute("product", product1);
		List<Object> productList=productDAO.listing();
		productModel.addAttribute("productList", productList);	
		productModel.addAttribute("categoryList", this.fetchCategoryList(categoryDAO.listing()));
		return "Product";
    } 	
	
	//Method to fetch list of categories w.r.t product
    public LinkedHashMap<Integer, String> fetchCategoryList(List<Object> categoryList)
    {
    	LinkedHashMap<Integer, String> listCategories=new LinkedHashMap<Integer, String>();
    	
    	for(Object category1:categoryList)
    	{
    		Category category=(Category)category1;
    		listCategories.put(category.getCategoryId(),category.getCategoryName());
    		
    	}
    	return listCategories;
    } 	
    
    //Method to display product images
    @RequestMapping(value={"/showproductimage","*/showproductimage"})
    public String displayProductImage(Model productModel)
    {
    	List<Object> productList=productDAO.listing();
    	productModel.addAttribute("productList", productList);	
    	return "ProductImage";
    }
    
}
