package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.User;

/**
 * Created by horz on 9/26/13.
 */
public class ListContactsRequest extends Request<User> {

    public ListContactsRequest(User attachment) {
        super(attachment);
    }

    @Override
    public String getServletPattern() {
        return "/listcontacts";
    }
}
