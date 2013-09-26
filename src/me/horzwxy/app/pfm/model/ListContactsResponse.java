package me.horzwxy.app.pfm.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by horz on 9/26/13.
 */
public class ListContactsResponse extends Response {

    public static final String CONTACTLIST_KEY = "contacts";

    private List< User > contactList;

    public ListContactsResponse( List< User > contactList ) {
        this.contactList = contactList;
    }

    public ListContactsResponse( Map< String, String > map ) {
        contactList = new ArrayList<User>();
        String[] contactString = map.get( CONTACTLIST_KEY ).split( "," );
        for( String nickname : contactString ) {
            contactList.add( new User( null, nickname ) );
        }
    }

    public List< User > getContactList() {
        return contactList;
    }

    @Override
    public String getPostContent() {
        String contactString = "";
        for( User contact : contactList ) {
            contactString += contact.nickname + ",";
        }
        return CONTACTLIST_KEY + "=" + contactString.substring( 0, contactString.length() - 1 );
    }
}
