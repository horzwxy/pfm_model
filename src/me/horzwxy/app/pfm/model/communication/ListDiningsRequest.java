package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.Dining;
import me.horzwxy.app.pfm.model.data.User;

/**
 * Created by horz on 10/3/13.
 */
public class ListDiningsRequest extends Request {

	/**
	 * -1 stands for fetching latest dinings
	 */
	public final static long UNDEFINED_ID = -1l;
	
    public String nickname;
    public long diningId;	// request for dinings no late than the one with this diningId
    public Dining.DiningState state;

    /**
	 * Leave for gson to instantialize this class.
	 * For coder, never try to call this constructor.
	 */
    public ListDiningsRequest() {}

    public ListDiningsRequest( User user ) {
        this( user.nickname );
    }

    /**
     * Set the other fields with default values.
     * @param nickname
     */
    public ListDiningsRequest( String nickname ) {
        this.nickname = nickname;
        this.diningId = UNDEFINED_ID;
        this.state = Dining.DiningState.NOT_APPROVED_YET;
    }
    
    public ListDiningsRequest( User user, long diningId, Dining.DiningState state ) {
    	this.nickname = user.nickname;
    	this.diningId = diningId;
    	this.state = state;
    }
    
    public User getUser() {
    	return new User( nickname );
    }

    @Override
    public String getServlePattern() {
        return "/listdinings";
    }
}
