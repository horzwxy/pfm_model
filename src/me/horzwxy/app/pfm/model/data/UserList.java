package me.horzwxy.app.pfm.model.data;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by horz on 10/2/13.
 */
public class UserList implements Serializable, Iterable<User> {

    private static Gson gson = new Gson();
    public ArrayList< User > users;

    public UserList() {
        users = new ArrayList<User>();
    }

    public UserList( ArrayList< String > nicknames ) {
        this.users = new ArrayList<User>();
        for( String nickname : nicknames ) {
            this.users.add(new User(nickname));
        }
    }

    public ArrayList< String > toNicknameList() {
        ArrayList< String > result = new ArrayList<String>();
        for( User user : this.users ) {
            result.add( user.nickname );
        }
        return result;
    }

    public String toJsonString() {
        return gson.toJson( this );
    }

    public static UserList fromJsonString( String jsonString ) {
        return gson.fromJson( jsonString, UserList.class );
    }

    public void add( User user ) {
        this.users.add( user );
    }

    public void remove( User user ) {
        this.users.remove( user );
    }

    public boolean contains( User user ) {
        return this.users.contains( user );
    }

    public int size() {
        return this.users.size();
    }

    @Override
    public String toString() {
        return gson.toJson( this );
    }

    @Override
    public Iterator<User> iterator() {
        return users.iterator();
    }
}
