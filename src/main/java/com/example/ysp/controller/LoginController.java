package com.example.ysp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.ysp.entity.UserLogin;
import com.example.ysp.service.InterfaceLoginService;

@Controller
public class LoginController {

	@Autowired
	InterfaceLoginService loginService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showWelcomePage() {
		System.out.println("Launching login Page");

		return "Login";
	}
	
	@RequestMapping(value = "/LoginUser")
	public String validateLoginUser(ModelMap model, UserLogin user, BindingResult result) {
		System.out.println("Inside validateLoginUser method");
		if (result.hasErrors()) {
			return "Login";
		}
		System.out.println("Checking Logged in user name: " + user.getUserName());
		System.out.println("Checking Logged in user password: " + user.getUserPassword());
		System.out.println("Checking Logged in user email: " + user.getUserEmail());
		System.out.println("Checking Logged in user contact: " + user.getUserContact());
		UserLogin validateUser = loginService.validateLogin(user.getUserName(), user.getUserPassword());
		if(validateUser.getId().equals(null)) {
			return "Login";
		}
		else {
			return "redirect:/shareHomePage";
		}
		
	}

	@RequestMapping(value = "/redirectSignUpPage", method = RequestMethod.GET)
	public String showSignUpPage() {
		System.out.println("redirectng Sign up page");

		return "CreateLogin";
	}

	@RequestMapping(value = "/createLoginUser", method = RequestMethod.POST)
	public String createLoginUser(ModelMap model, UserLogin user, BindingResult result) {
		System.out.println("Inside createLoginUser method");
		if (result.hasErrors()) {
			return "CreateLogin";
		}
		System.out.println("user name: " + user.getUserName());
		System.out.println("user password: " + user.getUserPassword());
		System.out.println("user email: " + user.getUserEmail());
		System.out.println("user contact: " + user.getUserContact());
		String userId = loginService.newUserSignUp(user);
		System.out.println("after creation of Account, user id : " + userId);
		if (!userId.isEmpty()) {
			return "Login";
		} else {
			return "CreateLogin";
		}

	}
	

}
