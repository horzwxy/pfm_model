package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.User;

/**
 * Created by horz on 10/1/13.
 */
public class LogInResponseContent implements ResponseContent {

    public ResultType type;
    public User user;

    public enum ResultType {
        SUCCESS,
        FAILED,
        SUCCESS_BUT_FIRST;
    }
}
