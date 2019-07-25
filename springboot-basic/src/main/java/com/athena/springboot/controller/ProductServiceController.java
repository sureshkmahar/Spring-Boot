package com.athena.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.athena.springboot.model.Product;
import com.athena.springboot.service.ProductService;

@RestController
public class ProductServiceController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }

	
	@GetMapping("/getAllProducts")
	public @ResponseBody List<Product> getAllProducts(){
		return productService.getAllProduct();
	}

}
