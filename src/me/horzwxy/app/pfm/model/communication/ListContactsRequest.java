package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.User;

/**
 * Created by horz on 10/2/13.
 */
public class ListContactsRequest extends Request {

    public String nickname;

    public ListContactsRequest() {

    }

    public ListContactsRequest( User user ) {
        this( user.nickname );
    }

    public ListContactsRequest( String nickname ) {
        this.nickname = nickname;
    }

    @Override
    public String getServlePattern() {
        return "/listcontacts";
    }
}
