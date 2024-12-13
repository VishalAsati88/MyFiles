package com.example.demorestapi.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demorestapi.IService.IProductService;
import com.example.demorestapi.Models.Product;



@CrossOrigin("http://localhost:4200")
@RestController  //It is the combination of @Controller Annotation & @ResponseBody 
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private IProductService productService;
	
	@GetMapping("/getallproducts")
	public List<Product> getAllProducts() {
		
		return productService.getAllProducts();
	}
	//RequestBody annotation map the HttpRequest body to a transfer enabling
	//automatic deserialization of inbound HttpRequest body onto a java object
	@PostMapping("/saveProduct")
	public Product saveProduct(@RequestBody Product pobj){
		Product p=null;
		System.out.println("save");
		try
		{
		p=productService.saveProduct(pobj);
		}
		
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return p;
			
	}
	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product p) {
		Product res=null;
		try
		{
			res=productService.updateProduct(p);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return res;
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public void deleteProduct(@PathVariable int id) {
		try
		{
			productService.deleteProduct(id);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
