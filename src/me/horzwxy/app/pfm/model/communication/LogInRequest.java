package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.User;

/**
 * Created by horz on 10/1/13.
 */
public class LogInRequest extends Request {

    public String accountName;
    public String accountType;

    /**
	 * Leave for gson to instantialize this class.
	 * For coder, never try to call this constructor.
	 */
    public LogInRequest() {}

    public LogInRequest( User user ) {
        this( user.accountName, user.accountType );
    }

    public LogInRequest( String accountName, String accountType ) {
        this.accountName = accountName;
        this.accountType = accountType;
    }

    @Override
    public String getServlePattern() {
        return "/login";
    }
}
