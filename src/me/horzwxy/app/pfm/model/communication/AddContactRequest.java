package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.User;

/**
 * Created by horz on 10/1/13.
 */
public class AddContactRequest extends Request {

    public User owner;
    public User friend;

    public AddContactRequest( User owner, User friend ) {
        this.owner = owner;
        this.friend = friend;
    }
}
