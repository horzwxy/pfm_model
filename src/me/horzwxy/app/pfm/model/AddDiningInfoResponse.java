package me.horzwxy.app.pfm.model;

import java.util.Map;

/**
 * Created by horz on 9/27/13.
 */
public class AddDiningInfoResponse extends Response {

    public static final String ADD_DINING_RESULT_TYPE = "type";

    private AddDiningInfoType type;

    public AddDiningInfoResponse( AddDiningInfoType type ) {
        this.type = type;
    }

    public AddDiningInfoResponse( Map< String, String > map ) {
        this.type = AddDiningInfoType.valueOf( map.get( ADD_DINING_RESULT_TYPE ) );
    }

    public AddDiningInfoType getType() {
        return this.type;
    }

    @Override
    public String getPostContent() {
        return RESPONSE_TYPE_KEY + "=" + RequestType.AddDiningInfo
                + "&" + ADD_DINING_RESULT_TYPE + "=" + type.toString();
    }

    public enum AddDiningInfoType {
        SUCCESS,
        FAILED;
    }
}
