package me.horzwxy.app.pfm.model.communication;

/**
 * Created by horz on 10/5/13.
 */
public class ApproveBillResponse extends Response {

    public ResultType type;

    public ApproveBillResponse() {

    }

    public ApproveBillResponse( ResultType type ) {

    }

    public enum ResultType {
        SUCCESS,
        FAILED;
    }
}
