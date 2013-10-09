package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.Bill;
import me.horzwxy.app.pfm.model.data.User;

public class ListBillsRequest extends Request {

	/**
	 * -1 stands for fetching latest bills
	 */
	public final static long UNDEFINED_ID = -1l;
	
	public String nickname;
	public Bill.BillState state;
	public long idBound;
	
	/**
	 * Leave for gson to instantialize this class.
	 * For coder, never try to call this constructor.
	 */
	public ListBillsRequest() {}
	
	/**
	 * All parameters stay default except user nickname, i.e. to fetch NOT_APPROVED_YET and latest bills.
	 * @param user current User instance
	 */
	public ListBillsRequest( User user ) {
		this( user.nickname, Bill.BillState.NOT_APPROVED_YET, UNDEFINED_ID );
	}
	
	public ListBillsRequest( User user, Bill.BillState state, Bill billBound ) {
		this( user.nickname, state, billBound.billId );
	}
	
	private ListBillsRequest( String nickname, Bill.BillState state, long idBound ) {
		this.nickname = nickname;
		this.state = state;
		this.idBound = idBound;
	}
	
	/**
	 * Get User instance which is requesting for bills.
	 * @return User instance with only nickname field filled
	 */
	public User getUser() {
		return new User( nickname );
	}
	
	@Override
	public String getServlePattern() {
		return "/listbills";
	}

}
