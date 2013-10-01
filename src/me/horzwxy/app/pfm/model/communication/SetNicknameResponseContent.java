package me.horzwxy.app.pfm.model.communication;

/**
 * Created by horz on 10/1/13.
 */
public class SetNicknameResponseContent implements ResponseContent {

    public ResultType type;

    public enum ResultType {
        SUCCESS,
        USED,
        FAILED;
    }
}
