package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.ContactInfo;
import me.horzwxy.app.pfm.model.data.User;

/**
 * Created by horz on 10/1/13.
 */
public class AddContactRequest extends Request {

    public String ownerNickname;
    public String friendNickname;

    /**
	 * Leave for gson to instantialize this class.
	 * For coder, never try to call this constructor.
	 */
    public AddContactRequest() {}

    public AddContactRequest( ContactInfo info ) {
        this( info.owner, info.friend.nickname );
    }

    public AddContactRequest( User owner, String friendNickname ) {
        this.ownerNickname = owner.nickname;
        this.friendNickname = friendNickname;
    }

    @Override
    public String getServlePattern() {
        return "/addcontact";
    }
}
