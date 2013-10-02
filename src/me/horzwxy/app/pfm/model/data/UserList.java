package me.horzwxy.app.pfm.model.data;

import java.util.ArrayList;

/**
 * Created by horz on 10/2/13.
 */
public class UserList extends ArrayList< User > {

    public UserList() {

    }

    public UserList( ArrayList< String > nicknames ) {
        for( String nickname : nicknames ) {
            add( new User( nickname ) );
        }
    }

    public ArrayList< String > toNicknameList() {
        ArrayList< String > result = new ArrayList<String>();
        for( User user : this ) {
            result.add( user.nickname );
        }
        return result;
    }
}
