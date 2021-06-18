package com.example.dts.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.dts.entity.ShareModel;



public interface ShareRepository extends MongoRepository<ShareModel	, String> {
	
	ShareModel findByIdEquals (String id);

}
