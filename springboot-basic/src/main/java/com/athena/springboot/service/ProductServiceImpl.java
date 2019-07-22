package com.athena.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.athena.springboot.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	
	@Override
	public ResponseEntity<Object> getAllProduct() {
		return productRepository.getAllProduct();
	}

}
