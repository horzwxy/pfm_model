package me.horzwxy.app.pfm.model.communication;

/**
 * Created by horz on 10/4/13.
 */
public class ApproveDiningResponse extends Response {

    public ResultType type;

    public ApproveDiningResponse() {

    }

    public ApproveDiningResponse( ResultType type ) {
        this.type = type;
    }

    public enum ResultType {
        SUCCESS,
        FAILED;
    }
}
