package me.horzwxy.app.pfm.model;

import java.util.Map;

/**
 * Created by horz on 9/13/13.
 */
public class LogInResponse extends Response {

    public static final String LOG_IN_TYPE_KEY = "type";
    public static final String NICKNAME_KEY = "nickname";

    private LogInResponseType type;
    private String nickname;

    public LogInResponse( LogInResponseType type, String nickname ) {
        this.type = type;
        this.nickname = nickname;
    }

    public LogInResponse( Map< String, String > responsePairs ) {
        type = LogInResponseType.valueOf( responsePairs.get( LOG_IN_TYPE_KEY ) );
        nickname = responsePairs.get( NICKNAME_KEY );
    }

    public LogInResponseType getType() {
        return type;
    }

    public String getNickname() {
        return nickname;
    }

    @Override
    public String getPostContent() {
        return RESPONSE_TYPE_KEY + "=" + RequestType.LogIn + "&" + LOG_IN_TYPE_KEY + "=" + type.toString() + "&" + NICKNAME_KEY + "=" + nickname;
    }

    public enum LogInResponseType {
        SUCCESS,
        FAILED,
        SUCCESS_BUT_FIRST;
    }
}
