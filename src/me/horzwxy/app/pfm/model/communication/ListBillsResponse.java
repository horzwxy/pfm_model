package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.BillList;

public class ListBillsResponse extends Response {
	
	public BillList list;

    public ListBillsResponse() {

    }

    public ListBillsResponse( BillList list ) {
        this.list = list;
    }
}
