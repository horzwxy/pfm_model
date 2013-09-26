package me.horzwxy.app.pfm.model;

/**
 * Created by horz on 9/26/13.
 */
public class ListContactsRequest extends Request< User > {

    public static final String NICKNAME_KEY = "nickname";

    public ListContactsRequest( User attachment ) {
        super( RequestType.ListContacts, attachment );
    }

    @Override
    public String getPostContent() {
        return NICKNAME_KEY + "=" + attachment.nickname;
    }
}
