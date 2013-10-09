package me.horzwxy.app.pfm.model.communication;

/**
 * Created by horz on 10/1/13.
 */
public class AddContactResponse extends Response {

    public ResultType type;

    /**
	 * Leave for gson to instantialize this class.
	 * For coder, never try to call this constructor.
	 */
    public AddContactResponse() {}

    public AddContactResponse( ResultType type ) {
        this.type = type;
    }

    public enum ResultType {
        SUCCEED,
        NO_SUCH_USER,
        FAIL;
    }
}
