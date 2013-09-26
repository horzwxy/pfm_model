package me.horzwxy.app.pfm.model;

import java.util.Map;

/**
 * Created by horz on 9/26/13.
 */
public class AddContactResponse extends Response {

    public static final String ADD_CONTACT_TYPE = "type";

    private AddContactResponseType type;

    public AddContactResponse( AddContactResponseType type ) {
        this.type = type;
    }

    public AddContactResponse( Map< String, String > map ) {
        this.type = AddContactResponseType.valueOf( map.get( RESPONSE_TYPE_KEY ) );
    }

    public AddContactResponseType getType() {
        return type;
    }

    @Override
    public String getPostContent() {
        return ADD_CONTACT_TYPE + "=" + type.toString();
    }

    public enum AddContactResponseType {
        SUCCESS,
        NO_SUCH_USER;
    }
}
