package com.athena.springboot.repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.athena.springboot.model.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
	private static Map<Integer, Product> productRepo = new HashMap<>();
	
	@PostConstruct
	public void init() {
		  Product honey = new Product();
	      honey.setId(1);
	      honey.setName("Honey");
	      honey.setPrice(100);
	      productRepo.put(honey.getId(), honey);
	      
	      Product almond = new Product();
	      almond.setId(2);
	      almond.setName("Almond");
	      almond.setPrice(250);
	      productRepo.put(almond.getId(), almond);
	}
	
	@Override
	public ResponseEntity<Object> getAllProduct() {
		return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
		
	}

}
