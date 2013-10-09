package me.horzwxy.app.pfm.model.data;

/**
 * Created by horz on 10/2/13.
 */
public class Bill extends PFMData {

    public final static long UNDEFINED_ID = -1;

    public long billId;
    public User lender;
    public User borrower;
    public Cost cost;
    public long diningId;   // which dining record generates this bill
    public BillState state;

    public Bill() {

    }
    
    public Bill( long billId, String lenderNickname, String borrowerNickname, int cost, long id, BillState state ) {
    	this( billId, new User( lenderNickname ), new User( borrowerNickname ), new Cost( cost, borrowerNickname ), id, state );
    }
    
    public Bill( String lenderNickname, String borrowerNickname, int cost, long id, BillState state ) {
    	this( UNDEFINED_ID, new User( lenderNickname ), new User( borrowerNickname ), new Cost( cost, borrowerNickname ), id, state );
    }
    
    public Bill( String lenderNickname, String borrowerNickname, int cost, long id ) {
    	this( lenderNickname, borrowerNickname, cost, id, BillState.NOT_APPROVED_YET );
    }

    public Bill( long billId, User lender, User borrower, Cost cost, long diningId, BillState state ) {
        this.billId = billId;
        this.lender = lender;
        this.borrower = borrower;
        this.cost = cost;
        this.diningId = diningId;
        this.state = state;
    }

    public enum BillState {
        NOT_APPROVED_YET,
        APPROVED,
        REJECTED,
        CLEARED;
    }
}
