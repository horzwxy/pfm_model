package me.horzwxy.app.pfm.model.communication;

/**
 * Created by horz on 10/5/13.
 */
public class ClearBillResponse extends Response {

    public ResultType type;

    /**
	 * Leave for gson to instantialize this class.
	 * For coder, never try to call this constructor.
	 */
    public ClearBillResponse() {}

    public ClearBillResponse( ResultType type ) {
        this.type = type;
    }

    public enum ResultType {
        SUCCESS,
        FAILED;
    }
}
