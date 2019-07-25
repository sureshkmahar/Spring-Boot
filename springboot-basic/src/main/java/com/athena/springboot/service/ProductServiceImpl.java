package com.athena.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.athena.springboot.model.Product;
import com.athena.springboot.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	
	@Override
	public List<Product> getAllProduct() {
		System.out.println("::::::::::::::::"+productRepository.findAll());
		return productRepository.findAll();
	}

}
