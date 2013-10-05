package me.horzwxy.app.pfm.model.communication;

/**
 * Created by horz on 10/5/13.
 */
public class ClearBillResponse extends Response {

    public ResultType type;

    public ClearBillResponse() {

    }

    public ClearBillResponse( ResultType type ) {
        this.type = type;
    }

    public enum ResultType {
        SUCCESS,
        FAILED;
    }
}
