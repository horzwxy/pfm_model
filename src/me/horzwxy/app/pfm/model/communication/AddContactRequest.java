package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.ContactInfo;
import me.horzwxy.app.pfm.model.data.User;

/**
 * Created by horz on 10/1/13.
 */
public class AddContactRequest extends Request {

    public String ownerNickname;
    public String friendNickname;

    public AddContactRequest( ContactInfo info ) {
        this( info.owner.nickname, info.friend.nickname );
    }

    public AddContactRequest( String ownerNickname, String friendNickname ) {
        this.ownerNickname = ownerNickname;
        this.friendNickname = friendNickname;
    }

    @Override
    public String getServlePattern() {
        return "/addcontact";
    }
}
