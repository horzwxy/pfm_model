package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.communication.Request;
import me.horzwxy.app.pfm.model.communication.RequestType;
import me.horzwxy.app.pfm.model.data.User;

/**
 * Created by horz on 9/14/13.
 */
public class SetNicknameRequest extends Request<User> {

    public SetNicknameRequest(User attachment) {
        super(attachment);
    }

    @Override
    public String getServletPattern() {
        return "/setnickname";
    }
}
