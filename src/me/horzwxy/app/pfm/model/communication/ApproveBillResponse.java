package me.horzwxy.app.pfm.model.communication;

/**
 * Created by horz on 10/5/13.
 */
public class ApproveBillResponse extends Response {

    public ResultType type;

    /**
	 * Leave for gson to instantialize this class.
	 * For coder, never try to call this constructor.
	 */
    public ApproveBillResponse() {}

    public ApproveBillResponse( ResultType type ) {
        this.type = type;
    }

    public enum ResultType {
        SUCCEED,
        FAIL;
    }
}
