package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.User;

/**
 * Created by horz on 9/14/13.
 */
public class LogInRequest extends Request<User> {

    public LogInRequest(User attachment) {
        super(attachment);
    }

    @Override
    public String getServletPattern() {
        return "/login";
    }
}
