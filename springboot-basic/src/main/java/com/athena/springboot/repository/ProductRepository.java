package com.athena.springboot.repository;

import java.util.List;

import com.athena.springboot.model.Product;

public interface ProductRepository {
	public List<Product> getAllProduct();

}
