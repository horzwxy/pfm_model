package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.User;

/**
 * Created by horz on 10/1/13.
 */
public class LogInResponse extends Response {

    public ResultType type;
    public User user;

    public LogInResponse( ResultType type, User user ) {
        this.type = type;
        this.user = user;
    }

    public enum ResultType {
        SUCCESS,
        FAILED,
        SUCCESS_BUT_FIRST;
    }
}
