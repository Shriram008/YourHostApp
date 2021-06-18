package com.example.ysp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.ysp.entity.ShareModel;



public interface ShareRepository extends MongoRepository<ShareModel	, String> {
	
	ShareModel findByIdEquals (String id);

}
