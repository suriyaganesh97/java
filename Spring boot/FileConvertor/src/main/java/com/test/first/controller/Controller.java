package com.test.first.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.first.FileConvertorApplication;
import com.test.first.Individual;
@RestController
public class Controller {
private static List<Individual> LIST_OUTPUT_TO_UI = null;

	@RequestMapping("/")
	public String sayHome() {	
		return "Home";
	}


@RequestMapping("/file/{firstname}")
public List < Individual > searchForName(@PathVariable String firstname) {
	LIST_OUTPUT_TO_UI= FileConvertorApplication.readFile(firstname);
	return LIST_OUTPUT_TO_UI;
}

}
