package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.BillApproval;

/**
 * Created by horz on 10/5/13.
 */
public class ApproveBillRequest extends Request {

    public BillApproval ba;

    public ApproveBillRequest() {

    }

    public ApproveBillRequest( BillApproval ba ) {
        this.ba = ba;
    }

    @Override
    public String getServlePattern() {
        return "/approvebill";
    }
}
