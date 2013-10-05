package me.horzwxy.app.pfm.model.data;

/**
 * Created by horz on 10/5/13.
 */
public class BillApproval {

    public User owner;
    public long billId;
    public Bill.BillState state;

    public BillApproval() {

    }

    public BillApproval( User owner, long diningId ) {
        this( owner, diningId, Bill.BillState.NOT_APPROVED_YET );
    }

    public BillApproval( User owner, long billId, Bill.BillState state ) {
        this.owner = owner;
        this.billId = billId;
        this.state = state;
    }
}
