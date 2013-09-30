package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.User;

/**
 * Created by horzwxy on 13-9-27.
 */
public class ListDiningRequest extends Request<User> {

    public ListDiningRequest(User user) {
        super(user);
    }

    @Override
    public String getServletPattern() {
        return "/listdinings";
    }
}
