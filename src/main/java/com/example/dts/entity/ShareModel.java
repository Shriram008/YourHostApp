package com.example.dts.entity;

import java.util.Date;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "share_model")
public class ShareModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 
	
	@Id
	String id;
	String shareName;
	float openingValue;
	Date tradeDate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getShareName() {
		return shareName;
	}
	public void setShareName(String shareName) {
		this.shareName = shareName;
	}
	public float getOpeningValue() {
		return openingValue;
	}
	public void setOpeningValue(float openingValue) {
		this.openingValue = openingValue;
	}
	public Date getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}


	
	
	
	
	

}

