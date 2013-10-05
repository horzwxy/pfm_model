package me.horzwxy.app.pfm.model.communication;

import java.util.ArrayList;

import me.horzwxy.app.pfm.model.data.Bill;
import me.horzwxy.app.pfm.model.data.BillList;

public class ListBillsResponse extends Response {
	
	public ArrayList<Bill> bills;

    public ListBillsResponse() {

    }

    public ListBillsResponse( ArrayList<Bill> bills ) {
        this.bills = bills;
    }
}
