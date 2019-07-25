package com.athena.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.athena.springboot.service.RestTestService;

@RestController
public class RestTestController {
	@Autowired
	private RestTestService restTestService;
	
	@RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }
	@GetMapping("/rest-service")
	public @ResponseBody String getService() {
		return restTestService.greet();
	}
}
