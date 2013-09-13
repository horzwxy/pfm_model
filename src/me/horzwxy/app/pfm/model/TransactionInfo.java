package me.horzwxy.app.pfm.model;

public class TransactionInfo implements Stringizable {
	
	public int id;
	public User borrower;
	public User lender;
	public int cost;
	public TransactionInfo state;
	
	@Override
	public String toKVPair() {
		String result = "id=" + id
				+ "&borrower=" + borrower.nickname
				+ "&lender=" + lender.nickname
				+ "&cost=" + cost
				+ "&state=" + state;
		return result;
	}
	
	public enum TransactionInfoState {
		NOT_APPROVED,
		APPROVED,
		REJECTED,
		CLEAR;
	}
}
