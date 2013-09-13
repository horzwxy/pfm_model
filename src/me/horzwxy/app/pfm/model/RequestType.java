package me.horzwxy.app.pfm.model;

import java.util.HashMap;

/**
 * Created by horz on 9/13/13.
 */
public enum RequestType {
    LOG_IN,
    SET_NICKNAME;

    private static HashMap< RequestType, String > servletPatternMap = new HashMap< RequestType, String>();

    static {
        servletPatternMap.put( LOG_IN, "/login" );
        servletPatternMap.put( SET_NICKNAME, "/setnickname" );
    }

    public String getServletPattern() {
        return servletPatternMap.get( this );
    }
}
