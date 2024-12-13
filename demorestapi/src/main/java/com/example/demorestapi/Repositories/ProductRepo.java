package com.example.demorestapi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;



import com.example.demorestapi.Models.Product;


public interface ProductRepo extends JpaRepository<Product, Integer> {

}
