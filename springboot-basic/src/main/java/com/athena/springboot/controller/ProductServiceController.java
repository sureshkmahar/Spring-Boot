package com.athena.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.athena.springboot.service.ProductService;

@RestController
public class ProductServiceController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/getAllProducts")
	public ResponseEntity<Object> getAllProducts(){
		return productService.getAllProduct();
	}

}
