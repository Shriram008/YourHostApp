package com.example.ysp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.ysp.entity.UserLogin;

public interface LoginRepository extends MongoRepository<UserLogin, String> {
	
	public List<UserLogin> findByUserName(String userName);

}
