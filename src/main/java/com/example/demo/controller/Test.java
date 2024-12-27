package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	
	@GetMapping("/test")
	public String showTest()
	{
		System.out.println("Inside Shekhar Branch");
		return "Hello Good Morning";
	}

}
