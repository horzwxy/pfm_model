package me.horzwxy.app.pfm.model.communication;

/**
 * Created by horz on 10/1/13.
 */
public class SetNicknameResponse extends Response {

    public ResultType type;

    /**
	 * Leave for gson to instantialize this class.
	 * For coder, never try to call this constructor.
	 */
    public SetNicknameResponse() {}

    public SetNicknameResponse( ResultType type ) {
        this.type = type;
    }

    public enum ResultType {
        SUCCESS,
        USED,
        FAILED;
    }
}
