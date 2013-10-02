package me.horzwxy.app.pfm.model.data;

import java.util.Date;

/**
 * Created by horz on 10/2/13.
 */
public class Bill {

    public User lender;
    public User borrower;
    public Cost cost;
    public Date date;
    public Dining source;   // which dining record generates this bill
    public String note;

    public enum BillState {
        NOT_APPROVED_YET,
        APPROVED,
        REJECTED,
        CLEARED,
        UNDEFINED;
    }
}
