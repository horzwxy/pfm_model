package me.horzwxy.app.pfm.model.data;

/**
 * Created by horz on 10/3/13.
 */
public class DiningApproval extends PFMData {

    public int diningId;
    public User user;
    public Dining.DiningState state;

    public DiningApproval() {

    }

    public DiningApproval( int diningId, User user, Dining.DiningState state ) {
        this.diningId = diningId;
        this.user = user;
        this.state = state;
    }
}
