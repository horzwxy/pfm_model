package me.horzwxy.app.pfm.model.communication;

import java.util.HashMap;

/**
 * Created by horz on 9/13/13.
 */
public enum RequestType {

    LogIn( "/login" ),
    SetNickname( "/setnickname" ),
    NewDiningInfo( "/newdining" ),
    ListContacts( "/listcontacts" ),
    AddContact( "/addcontact" ),
    ListDinings( "/listdinings" );

    private String servletPattern;

    RequestType( String servletPattern ) {
        this.servletPattern = servletPattern;
    }

    public String getServletPattern() {
        return servletPattern;
    }
}
