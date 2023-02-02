package com.dockertest.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@GetMapping("/")
	public Map<String,Object> getData()
	{
		Map<String,Object>values = new HashMap<>();
		values.put("Message","Spring Boot application is working");
		values.put("Languages", Arrays.asList("Java","Golang","C++"));
		values.put("Code", 1234);
		return values;
	}

}
