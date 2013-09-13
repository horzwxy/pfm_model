package me.horzwxy.app.pfm.model;

/**
 * Created by horz on 9/13/13.
 */
public class LogInResponse extends ResponseInfo {

    public LogInResponseType type;
    public String nickname;

    public LogInResponse( LogInResponseType type, String nickname ) {
        this.type = type;
        this.nickname = nickname;
    }
}
