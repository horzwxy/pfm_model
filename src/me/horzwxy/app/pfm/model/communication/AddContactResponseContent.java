package me.horzwxy.app.pfm.model.communication;

/**
 * Created by horz on 10/1/13.
 */
public class AddContactResponseContent implements ResponseContent {

    public ResultType type;
    public String nickname;

    public enum ResultType {
        SUCCESS,
        FAILED;
    }
}
