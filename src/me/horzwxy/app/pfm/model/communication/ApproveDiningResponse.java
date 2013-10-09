package me.horzwxy.app.pfm.model.communication;

/**
 * Created by horz on 10/4/13.
 */
public class ApproveDiningResponse extends Response {

    public ResultType type;

    /**
	 * Leave for gson to instantialize this class.
	 * For coder, never try to call this constructor.
	 */
    public ApproveDiningResponse() {}

    public ApproveDiningResponse( ResultType type ) {
        this.type = type;
    }

    public enum ResultType {
        SUCCEED,
        FAIL;
    }
}
