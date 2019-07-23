package com.athena.springboot.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.athena.springboot.model.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
	
	private static List<Product> prodLst=new ArrayList<>();
	
	@PostConstruct
	public void init() {
		  Product honey = new Product();
	      honey.setId(1);
	      honey.setName("Honey");
	      honey.setPrice(100);
	      prodLst.add(honey);
	      
	      Product almond = new Product();
	      almond.setId(2);
	      almond.setName("Almond");
	      almond.setPrice(250);
	      prodLst.add(almond);
	}
	
	@Override
	public List<Product> getAllProduct() {
		return prodLst;
		
	}

}
