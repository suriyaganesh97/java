package com.suriya.first.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
	
	@RequestMapping("/")
	public String sayHome() {
		return "Home";
}
	
	@RequestMapping("/jspTest")
	public String jspTest() {
		return "sayHello";
}
}