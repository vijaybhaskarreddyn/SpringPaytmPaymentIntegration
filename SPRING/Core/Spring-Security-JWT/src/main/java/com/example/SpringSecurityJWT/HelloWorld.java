package com.example.SpringSecurityJWT;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@RequestMapping("/hello")
	public String sayHello() {
		return "HelloWorld";
	}
	@RequestMapping("/date")
	public String currentDate() {
		return "CurrentDate"+ new Date();
	}
}
