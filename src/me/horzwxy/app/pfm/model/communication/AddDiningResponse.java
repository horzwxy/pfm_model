package me.horzwxy.app.pfm.model.communication;

/**
 * Created by horz on 10/2/13.
 */
public class AddDiningResponse extends Response {

    public ResultType type;

    /**
	 * Leave for gson to instantialize this class.
	 * For coder, never try to call this constructor.
	 */
    public AddDiningResponse() {}

    public AddDiningResponse( ResultType type ) {
        this.type = type;
    }

    public enum ResultType {
        SUCCEED,
        FAIL;
    }
}
