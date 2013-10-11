package me.horzwxy.app.pfm.model.communication;

import java.util.ArrayList;

import me.horzwxy.app.pfm.model.data.UserList;

/**
 * List all the contacts, not only the latest created ones.
 * Created by horz on 10/2/13.
 */
public class ListContactsResponse extends Response {

    public ArrayList< String > friendsNicknames;	// null stands for no contacts to show

    /**
	 * Leave for gson to instantialize this class.
	 * For coder, never try to call this constructor.
	 */
    public ListContactsResponse() {}

    public ListContactsResponse( UserList userList ) {
        this( userList.toNicknameList() );
    }

    public ListContactsResponse( ArrayList< String > friendsNicknames ) {
        this.friendsNicknames = friendsNicknames;
    }

    public UserList getUserList() {
        return new UserList( friendsNicknames );
    }
}
