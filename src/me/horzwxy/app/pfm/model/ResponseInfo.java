package me.horzwxy.app.pfm.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by horz on 9/13/13.
 */
public class ResponseInfo {

    private static Map< String, String > splitResponse( String response ) {
        Map< String, String > result = new HashMap< String, String >();
        String[] parts = response.split("&");
        for( String part : parts ) {
            String key = part.split("=")[0];
            String value = part.split("=")[1];
            result.put( key, value );
        }
        return result;
    }

    public static ResponseInfo parseResponse( String response ) {
        Map< String, String > map = splitResponse( response );
        RequestType type = RequestType.valueOf( map.get( "response-type" ) );
        return
    }

    public
}
