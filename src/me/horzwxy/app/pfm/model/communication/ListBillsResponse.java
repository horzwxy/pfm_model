package me.horzwxy.app.pfm.model.communication;

import java.util.ArrayList;

import me.horzwxy.app.pfm.model.data.Bill;

public class ListBillsResponse extends Response {
	
	public ArrayList<Bill> bills;	// null stands for no bills to show

	/**
	 * Leave for gson to instantialize this class.
	 * For coder, never try to call this constructor.
	 */
    public ListBillsResponse() {}

    public ListBillsResponse( ArrayList<Bill> bills ) {
        this.bills = bills;
    }
}
