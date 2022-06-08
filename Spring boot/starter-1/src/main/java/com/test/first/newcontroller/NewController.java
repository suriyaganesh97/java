package com.test.first.newcontroller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}


@RequestMapping("/")
public String sayHome() {
	return "Home";
}

//@RequestMapping("/error")
//public String sayError() {
//	return "Error";
//}
}
