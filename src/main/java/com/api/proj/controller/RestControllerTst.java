package com.api.proj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerTst {
	@GetMapping("/home")
	public String home() {
		return "Welcome to Student Info Application";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello world!";
	}
}
