package me.horzwxy.app.pfm.model.communication;

import java.util.Map;

/**
 * Created by horz on 9/13/13.
 */
public class LogInResponse extends Response<LogInResponse> {

    private LogInResponseType type;
    private String nickname;

    public LogInResponseType getType() {
        return type;
    }

    public String getNickname() {
        return nickname;
    }

    public enum LogInResponseType {
        SUCCESS,
        FAILED,
        SUCCESS_BUT_FIRST;
    }
}
