package com.test.first.newcontroller;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {
	static Logger logger =org.apache.logging.log4j.LogManager.getLogger((NewController.class));
	//static Logger logger = Logger.getLogger(NewController.class.getName());
	 
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}

	@RequestMapping("/helloworld")
	public String sayHiworld() {
		return "Hi world";
	}

@RequestMapping("/")
public String sayHome() {
	  logger.error("ERROR");
      logger.warn("WARNING"); 
      logger.fatal("FATAL");
      logger.debug("DEBUG");
	return "Home";
}

//@RequestMapping("/error")
//public String sayError() {
//	return "Error";
//}
}
