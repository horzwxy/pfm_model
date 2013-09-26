package me.horzwxy.app.pfm.model;

/**
 * Created by horz on 9/26/13.
 */
public class AddContactRequest extends Request< ContactInfo > {

    public static final String OWNER_KEY = "owner";
    public static final String FRIEND_KEY = "friend";

    public AddContactRequest( ContactInfo attachment ) {
        super( RequestType.AddContact, attachment );
    }

    @Override
    public String getPostContent() {
        return OWNER_KEY + "=" + attachment.owner.nickname
                + "&" + FRIEND_KEY + "=" + attachment.friend.nickname;
    }
}
