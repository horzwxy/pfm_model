package me.horzwxy.app.pfm.model.communication;

/**
 * Created by horz on 10/1/13.
 */
public enum ClientRequestType {

    LogIn( "/login", LogInResponseContent.class ),
    SetNickname( "/setnickname", SetNicknameResponseContent.class ),
    NewDiningInfo( "/newdining", NewDiningResponseContent.class ),
    AddContact( "/addcontact", AddContactResponseContent.class );

    public String servletPattern;
    public Class< ? extends ResponseContent > responseContentClass;

    < T extends ResponseContent > ClientRequestType( String servletPattern, Class< T > responseContentClass ) {
        this.servletPattern = servletPattern;
        this.responseContentClass = responseContentClass;
    }
}
