package com.cg.shoppingcartsystem.productservice.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.shoppingcartsystem.productservice.entities.Product;

public interface ProductRepository extends MongoRepository<Product, Integer> {

	Product getProductByProductId(int productid);
	   // Optional<Product> findByProductName(String productname);

	
	}

