package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.Dining;
import me.horzwxy.app.pfm.model.data.DiningApproval;
import me.horzwxy.app.pfm.model.data.User;

/**
 * Created by horz on 10/4/13.
 */
public class ApproveDiningRequest extends Request {

    public String nickname;
    public long diningId;
    public Dining.DiningState newState;

    public ApproveDiningRequest() {

    }

    public ApproveDiningRequest( String nickname, long diningId, Dining.DiningState state ) {
        this.nickname = nickname;
        this.diningId = diningId;
        this.newState = state;
    }

    public ApproveDiningRequest( DiningApproval da ) {
        this( da.user.nickname, da.diningId, da.state );
    }
    
    public DiningApproval getDiningApproval() {
    	return new DiningApproval( diningId, new User( nickname ), newState );
    }
    
    public Dining getDining() {
    	return new Dining( diningId );
    }

    @Override
    public String getServlePattern() {
        return "/approvedining";
    }
}
