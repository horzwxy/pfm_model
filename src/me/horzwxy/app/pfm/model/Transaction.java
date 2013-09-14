package me.horzwxy.app.pfm.model;

public class Transaction implements PFMData {
	
	public int id;
	public User borrower;
	public User lender;
	public int cost;
	public TransactionState state;
	
//	@Override
//	public String toKVPair() {
//		String result = "id=" + id
//				+ "&borrower=" + borrower.nickname
//				+ "&lender=" + lender.nickname
//				+ "&cost=" + cost
//				+ "&state=" + state;
//		return result;
//	}
	
	public enum TransactionState {
		NOT_APPROVED,
		APPROVED,
		REJECTED,
		CLEAR;
	}
}
