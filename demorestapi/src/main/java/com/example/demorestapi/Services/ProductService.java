package com.example.demorestapi.Services;

import java.util.List;


//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demorestapi.IService.IProductService;
import com.example.demorestapi.Models.Product;
import com.example.demorestapi.Repositories.ProductRepo;

import jakarta.transaction.Transactional;

@Service
public class ProductService implements IProductService {

	@Autowired
	private ProductRepo productRepo;

	public List<Product> getAllProducts() {

		List<Product> productlist = productRepo.findAll();
		
		
		
		return productlist;
	}

	public Product saveProduct(Product p) {

		Product res = productRepo.save(p);
		
		return res;
	}

	@SuppressWarnings("deprecation")
	@Transactional
	public Product updateProduct(Product p) {
		Product p1 = new Product();
		p1 = (Product) productRepo.getOne(p.getId());

		
		if (p1 != null) {
			p1.setName(p.getName());
			p1.setPrice(p.getPrice());
			p1 = productRepo.save(p1); // update
		}
		return p1;
	}

	public void deleteProduct(int id) {

		productRepo.deleteById(id);

	}
}
