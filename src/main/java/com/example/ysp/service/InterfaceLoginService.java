package com.example.ysp.service;

import com.example.ysp.entity.UserLogin;

public interface InterfaceLoginService {
	
	public UserLogin validateLogin (String userName, String userPassword);
	public String newUserSignUp (UserLogin u1);
	public UserLogin forgotPassword (String userName, String userEmail);
	

}
