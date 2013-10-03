package me.horzwxy.app.pfm.model.data;

/**
 * Created by horz on 9/26/13.
 */
public class ContactInfo extends PFMData {

    public User owner;
    public User friend;

    public ContactInfo() {

    }

    public ContactInfo(User owner, User friend) {
        this.owner = owner;
        this.friend = friend;
    }

    public ContactInfo( String ownerNickname, String friendNickname ) {
        this( new User( ownerNickname ), new User( friendNickname ) );
    }
}
