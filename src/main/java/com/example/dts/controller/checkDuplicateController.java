package com.example.dts.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dts.entity.DuplicateTransactionBean;

//@RequestMapping(value = "/Share")
@CrossOrigin
@RestController
public class checkDuplicateController {
	
	@RequestMapping(value = "/checkDuplicate1")
	public static String checkInputTrial() {
		return "this is trial check";
	}
	
	@RequestMapping(value = "/checkDuplicate")
	public static String checkInputValue( @RequestBody DuplicateTransactionBean d1) {
		return d1.getMemberId();
	}
	
}
