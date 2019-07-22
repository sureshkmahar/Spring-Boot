package com.athena.springboot.repository;

import org.springframework.http.ResponseEntity;

public interface ProductRepository {
	public ResponseEntity<Object> getAllProduct();

}
