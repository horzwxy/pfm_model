package me.horzwxy.app.pfm.model.data;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by horz on 10/2/13.
 */
public class UserCostMap extends HashMap< User, Cost > implements Serializable {

    private static Gson gson = new Gson();

    public UserCostMap() {
    }

    public UserCostMap( HashMap< String, Cost > map ) {
        Set< String > keySet = map.keySet();
        for( String key : keySet ) {
            put( new User( key ), map.get( key ) );
        }
    }

    public HashMap< String, Cost > toNicknameMap() {
        HashMap< String, Cost > nicknameMap = new HashMap<String, Cost>();
        Set< User > keySet = keySet();
        for( User user : keySet ) {
            nicknameMap.put( user.nickname, get( user ) );
        }
        return nicknameMap;
    }

    public static UserCostMap fromJsonString( String jsonString ) {
        return gson.fromJson( jsonString, UserCostMap.class );
    }

    public String toJsonString() {
        return gson.toJson( this );
    }

    @Override
    public String toString() {
        return gson.toJson( this );
    }
}
