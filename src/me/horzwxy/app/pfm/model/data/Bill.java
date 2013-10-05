package me.horzwxy.app.pfm.model.data;

import java.util.Date;

/**
 * Created by horz on 10/2/13.
 */
public class Bill extends PFMData {

    public User lender;
    public User borrower;
    public Cost cost;
    public long id;   // which dining record generates this bill
    public BillState state;

    public Bill() {

    }
    
    public Bill( String lenderNickname, String borrowerNickname, int cost, long id, BillState state ) {
    	this( new User( lenderNickname ), new User( borrowerNickname ), new Cost( cost, borrowerNickname ), id, state );
    }
    
    public Bill( String lenderNickname, String borrowerNickname, int cost, long id ) {
    	this( lenderNickname, borrowerNickname, cost, id, BillState.NOT_APPROVED_YET );
    }

    public Bill( User lender, User borrower, Cost cost, long id, BillState state ) {
        this.lender = lender;
        this.borrower = borrower;
        this.cost = cost;
        this.id = id;
        this.state = state;
    }

    public enum BillState {
        NOT_APPROVED_YET,
        APPROVED,
        REJECTED,
        CLEARED;
    }
}
