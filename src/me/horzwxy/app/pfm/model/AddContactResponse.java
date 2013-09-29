package me.horzwxy.app.pfm.model;

import java.util.Map;

/**
 * Created by horz on 9/26/13.
 */
public class AddContactResponse extends Response {

    public static final String ADD_CONTACT_TYPE = "type";

    private AddContactResponseType type;

    public AddContactResponseType getType() {
        return type;
    }

    @Override
    public String getPostContent() {
        return RESPONSE_TYPE_KEY + "=" + RequestType.AddContact.toString() + "&" + ADD_CONTACT_TYPE + "=" + type.toString();
    }

    public enum AddContactResponseType {
        SUCCESS,
        NO_SUCH_USER;
    }
}
