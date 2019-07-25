package com.athena.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.athena.springboot.repository.RestTestRepository;

@Service
public class RestTestServiceImpl implements RestTestService {
	@Autowired(required = true)
	private RestTestRepository repository;
	
	
	@Override
	public String greetService() {
	
		return repository.greetRepogitory();
	}

}
