package me.horzwxy.app.pfm.model.data;

import java.util.Date;

public class Dining extends PFMData {

    public static final long UNDEFINED_ID = -1;

    public long id;
    public Restaurant restaurant;
    public Date date;
    public Cost cost;
    public UserList participants;
    public CostList specialCosts;
    public CostList paids;
    public User author;
    public DiningState state;

    public Dining( long id ) {
    	this.id = id;
    }
    
    public Dining( long id,
                   Restaurant restaurant,
                   Date date,
                   Cost cost,
                   UserList participants,
                   CostList specialCosts,
                   CostList paids,
                   User author,
                   DiningState state ) {
        this.id = id;
        this.restaurant = restaurant;
        this.date = date;
        this.cost = cost;
        this.participants = participants;
        this.specialCosts = specialCosts;
        this.paids = paids;
        this.author = author;
        this.state = state;
    }

    public Dining( Restaurant restaurant,
                   Date date,
                   Cost cost,
                   UserList participants,
                   CostList specialCosts,
                   CostList paids,
                   User author ) {
        this( UNDEFINED_ID, restaurant, date, cost, participants, specialCosts, paids, author, DiningState.NOT_APPROVED_YET );
    }

    public Dining() {
        this( null, null, null, new UserList(), new CostList(), new CostList(), null );
    }

    public enum DiningState {
        NOT_APPROVED_YET,
        APPROVED,
        REJECTED;
    }
}
