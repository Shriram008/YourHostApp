package com.example.ysp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ysp.entity.UserLogin;
import com.example.ysp.repository.LoginRepository;

@Service
public class LoginService implements InterfaceLoginService {
	
	@Autowired
	LoginRepository loginRepo;
	
	public UserLogin validateLogin (String userName, String userPassword) {
		List<UserLogin> userList = loginRepo.findByUserName(userName);
		UserLogin loggedInUser = new UserLogin();
		for (UserLogin user : userList) {
			if(user.getUserPassword().equals(userPassword)) {
				loggedInUser=user;
			}
		}
		return loggedInUser;
	}
	
	public String newUserSignUp (UserLogin u1) {
		
		loginRepo.save(u1);
		return u1.getId();
		
		}
	
	public UserLogin forgotPassword (String userName, String userEmail) {
		return null;
	}
	
	

}
