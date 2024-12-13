package com.example.demorestapi.IService;

import java.util.List;



import com.example.demorestapi.Models.Product;


public interface IProductService {
	List<Product> getAllProducts();
	Product saveProduct(Product p) ;
	Product updateProduct(Product p) ;
	void deleteProduct(int id);
}
