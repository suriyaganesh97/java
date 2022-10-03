package com.suriya.first.controller;





import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Controller {
static Logger logger =org.apache.logging.log4j.LogManager.getLogger((Controller.class));
	boolean isPasswordMatching=false;
	String nameInBackend="suriya";
	String passwordInBackend="Password";
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
	
	@RequestMapping("/login")
	public ResponseEntity<HttpStatus> logIn(@RequestParam String name,@RequestParam String password) {
		logger.debug(name);
		logger.debug(password);
		logger.debug(nameInBackend);
		logger.debug(passwordInBackend);
		if(name.equals(nameInBackend) && password.equals(passwordInBackend)) {
			return new ResponseEntity<>( HttpStatus.OK);
		} 
			return new ResponseEntity<>( HttpStatus.NOT_FOUND);

}
}
