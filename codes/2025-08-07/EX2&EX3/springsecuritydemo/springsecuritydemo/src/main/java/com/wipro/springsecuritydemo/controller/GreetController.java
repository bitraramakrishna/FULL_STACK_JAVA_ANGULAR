package com.wipro.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
		
	 @GetMapping("/hello")
	    public String hello() {
	        return "Hello, this endpoint no authentication !";
	    }
	  @GetMapping("/greet")
	    public String greet() {
	        return "Hello from Greet ";
	    }
}
