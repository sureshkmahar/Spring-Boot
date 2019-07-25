package com.athena.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {
	@RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }
}
