package me.horzwxy.app.pfm.model.communication;

/**
 * Created by horz on 10/1/13.
 */
public class SetNicknameResponse extends Response {

    public ResultType type;

    public SetNicknameResponse( ResultType type ) {
        this.type = type;
    }

    public enum ResultType {
        SUCCESS,
        USED,
        FAILED;
    }
}
