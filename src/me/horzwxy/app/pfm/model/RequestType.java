package me.horzwxy.app.pfm.model;

import java.util.HashMap;

/**
 * Created by horz on 9/13/13.
 */
public enum RequestType {
    LogIn,
    SetNickname;

    private static HashMap< RequestType, String > servletPatternMap = new HashMap< RequestType, String>();

    static {
        servletPatternMap.put( LogIn, "/login" );
        servletPatternMap.put( SetNickname, "/setnickname" );
    }

    public String getServletPattern() {
        return servletPatternMap.get( this );
    }
}
