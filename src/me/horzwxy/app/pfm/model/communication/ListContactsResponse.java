package me.horzwxy.app.pfm.model.communication;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import me.horzwxy.app.pfm.model.data.User;

/**
 * Created by horz on 9/26/13.
 */
public class ListContactsResponse extends Response {

    public static final String CONTACTLIST_KEY = "contacts";

    private List<User> contactList;

    public ListContactsResponse(List<User> contactList) {
        this.contactList = contactList;
    }

    public ListContactsResponse(Map<String, String> map) {
        contactList = new ArrayList<User>();
        String listString = map.get(CONTACTLIST_KEY);
        if (listString != null) {
            String[] contactString = listString.split(",");
            for (String nickname : contactString) {
                contactList.add(new User(null, nickname, null));
            }
        }
    }

    public List<User> getContactList() {
        return contactList;
    }

    @Override
    public String getPostContent() {
        String contactString = "";
        if (contactList.size() == 0) {
            return RESPONSE_TYPE_KEY + "=" + RequestType.ListContacts.toString() + "&" + CONTACTLIST_KEY + "=";
        }
        for (User contact : contactList) {
            contactString += contact.nickname + ",";
        }
        return RESPONSE_TYPE_KEY + "=" + RequestType.ListContacts.toString() + "&" + CONTACTLIST_KEY + "=" + contactString.substring(0, contactString.length() - 1);
    }
}
