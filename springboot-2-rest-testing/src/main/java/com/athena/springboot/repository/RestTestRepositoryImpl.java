package com.athena.springboot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class RestTestRepositoryImpl implements RestTestRepository{

	@Override
	public String greetRepogitory() {
		return "Hello Repogitoy";
	}

}
