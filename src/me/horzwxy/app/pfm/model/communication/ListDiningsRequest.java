package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.User;

/**
 * Created by horz on 10/3/13.
 */
public class ListDiningsRequest extends Request {

    public String nickname;

    /**
	 * Leave for gson to instantialize this class.
	 * For coder, never try to call this constructor.
	 */
    public ListDiningsRequest() {}

    public ListDiningsRequest( User user ) {
        this( user.nickname );
    }

    public ListDiningsRequest( String nickname ) {
        this.nickname = nickname;
    }
    
    public User getUser() {
    	return new User( nickname );
    }

    @Override
    public String getServlePattern() {
        return "/listdinings";
    }
}
