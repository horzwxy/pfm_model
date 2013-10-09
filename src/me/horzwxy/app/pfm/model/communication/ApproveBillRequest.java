package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.Bill;
import me.horzwxy.app.pfm.model.data.BillApproval;

/**
 * Created by horz on 10/5/13.
 */
public class ApproveBillRequest extends Request {

	public String nickname;
	public long billId;
	public Bill.BillState state;

	/**
	 * Leave for gson to instantialize this class.
	 * For coder, never try to call this constructor.
	 */
    public ApproveBillRequest() {}

    public ApproveBillRequest( BillApproval ba ) {
        this.nickname = ba.owner.nickname;
        this.billId = ba.billId;
        this.state = ba.state;
    }

    @Override
    public String getServlePattern() {
        return "/approvebill";
    }
}
