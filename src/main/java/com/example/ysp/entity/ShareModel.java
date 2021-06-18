package com.example.ysp.entity;

import java.util.Date;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "share_model")
public class ShareModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 
	
	@Id
	int id;
	String shareName;
	double sharePrice;
	int shareQuantity;
	Date shareUptodate;
	double netWorth;
	boolean validNewShare;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShareName() {
		return shareName;
	}
	public void setShareName(String shareName) {
		this.shareName = shareName;
	}
	public double getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
	public int getShareQuantity() {
		return shareQuantity;
	}
	public void setShareQuantity(int shareQuantity) {
		this.shareQuantity = shareQuantity;
	}
	public Date getShareUptodate() {
		return shareUptodate;
	}
	public void setShareUptodate(Date shareUptodate) {
		this.shareUptodate = shareUptodate;
	}
	public double getNetWorth() {
		return netWorth;
	}
	public void setNetWorth(double netWorth) {
		this.netWorth = netWorth;
	}
	public boolean isValidNewShare() {
		return validNewShare;
	}
	public void setValidNewShare(boolean validNewShare) {
		this.validNewShare = validNewShare;
	}



	
	
	
	
	

}

