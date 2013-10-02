package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.User;

/**
 * Created by horz on 10/1/13.
 */
public class LogInRequest extends Request {

    public User user;

    public LogInRequest( User user ) {
        this.user = user;
    }
}
