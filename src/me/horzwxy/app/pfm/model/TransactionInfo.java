package me.horzwxy.app.pfm.model;

public class TransactionInfo {
	
	public int id;
	public User borrower;
	public User lender;
	public int cost;
	public TransactionInfo state;
	
	public enum TransactionInfoState {
		NOT_APPROVED,
		APPROVED,
		REJECTED,
		CLEAR;
	}
}
