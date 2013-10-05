package me.horzwxy.app.pfm.model.data;

/**
 * Created by horz on 10/5/13.
 */
public class BillApproval {

    public User user;
    public long diningId;
    public Bill.BillState state;

    public BillApproval() {

    }

    public BillApproval( User user, long diningId ) {
        this( user, diningId, Bill.BillState.NOT_APPROVED_YET );
    }

    public BillApproval( User user, long diningId, Bill.BillState state ) {
        this.user = user;
        this.diningId = diningId;
        this.state = state;
    }
}
