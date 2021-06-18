package com.example.ysp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@RequestMapping(value = "/Share")
@CrossOrigin
@RestController
public class checkDuplicateController {
	
	@RequestMapping(value = "/checkDuplicate1")
	public static String checkInputTrial() {
		return "this is trial check";
	}
	
	
	
}
