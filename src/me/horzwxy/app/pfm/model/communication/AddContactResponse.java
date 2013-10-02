package me.horzwxy.app.pfm.model.communication;

/**
 * Created by horz on 10/1/13.
 */
public class AddContactResponse extends Response {

    public ResultType type;

    public AddContactResponse( ResultType type ) {
        this.type = type;
    }

    public enum ResultType {
        SUCCESS,
        NO_SUCH_USER,
        FAILED;
    }
}
