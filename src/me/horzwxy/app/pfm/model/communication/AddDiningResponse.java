package me.horzwxy.app.pfm.model.communication;

/**
 * Created by horz on 10/2/13.
 */
public class AddDiningResponse extends Response {

    public ResultType type;

    AddDiningResponse() {

    }

    public AddDiningResponse( ResultType type ) {
        this.type = type;
    }

    public enum ResultType {
        SUCCESS,
        FAILED;
    }
}
