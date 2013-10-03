package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.User;

/**
 * Created by horz on 10/1/13.
 */
public class LogInResponse extends Response {

    public ResultType type;
    public String nickname;

    public LogInResponse() {

    }

    public LogInResponse( ResultType type, String nickname ) {
        this.type = type;
        this.nickname = nickname;
    }

    public enum ResultType {
        SUCCESS,
        FAILED,
        SUCCESS_BUT_FIRST;
    }
}
