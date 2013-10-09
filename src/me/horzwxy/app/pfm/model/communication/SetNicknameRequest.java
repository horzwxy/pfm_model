package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.User;

/**
 * Created by horz on 10/1/13.
 */
public class SetNicknameRequest extends Request {

    public User user;

    /**
	 * Leave for gson to instantialize this class.
	 * For coder, never try to call this constructor.
	 */
    public SetNicknameRequest() {}

    public SetNicknameRequest( User user ) {
        this.user = user;
    }

    @Override
    public String getServlePattern() {
        return "/setnickname";
    }
}
