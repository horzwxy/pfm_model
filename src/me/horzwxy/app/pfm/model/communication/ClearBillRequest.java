package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.Bill;
import me.horzwxy.app.pfm.model.data.BillApproval;
import me.horzwxy.app.pfm.model.data.User;

/**
 * Created by horz on 10/5/13.
 */
public class ClearBillRequest extends Request {

    public String nickname;
    public long billId;

    /**
	 * Leave for gson to instantialize this class.
	 * For coder, never try to call this constructor.
	 */
    public ClearBillRequest() {}

    public ClearBillRequest( User user, long billId ) {
        this.nickname = user.nickname;
        this.billId = billId;
    }
    
    public BillApproval getBa() {
    	return new BillApproval( new User( nickname ), billId, Bill.BillState.CLEARED );
    }

    @Override
    public String getServlePattern() {
        return "/clearbill";
    }
}
