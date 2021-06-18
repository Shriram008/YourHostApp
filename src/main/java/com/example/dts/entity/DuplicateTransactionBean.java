package com.example.dts.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DuplicateTransactionBean {
	String memberId;
	String fromAccountId;
	boolean isFromAccountValid;
	String toAccountId;
	boolean isToAccountValid;

	/*
	 * BigDecimal txnAmount; Date requestedDate; String appCategory; String
	 * txnStatus;
	 */
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getFromAccountId() {
		return fromAccountId;
	}
	public void setFromAccountId(String fromAccountId) {
		this.fromAccountId = fromAccountId;
	}
	public boolean isFromAccountValid() {
		return isFromAccountValid;
	}
	public void setFromAccountValid(boolean isFromAccountValid) {
		this.isFromAccountValid = isFromAccountValid;
	}
	public String getToAccountId() {
		return toAccountId;
	}
	public void setToAccountId(String toAccountId) {
		this.toAccountId = toAccountId;
	}
	public boolean isToAccountValid() {
		return isToAccountValid;
	}
	public void setToAccountValid(boolean isToAccountValid) {
		this.isToAccountValid = isToAccountValid;
	}
	
	/*
	 * public BigDecimal getTxnAmount() { return txnAmount; } public void
	 * setTxnAmount(BigDecimal txnAmount) { this.txnAmount = txnAmount; } public
	 * Date getRequestedDate() { return requestedDate; } public void
	 * setRequestedDate(Date requestedDate) { this.requestedDate = requestedDate; }
	 * public String getAppCategory() { return appCategory; } public void
	 * setAppCategory(String appCategory) { this.appCategory = appCategory; } public
	 * String getTxnStatus() { return txnStatus; } public void setTxnStatus(String
	 * txnStatus) { this.txnStatus = txnStatus; }
	 */
	
	
	
}
