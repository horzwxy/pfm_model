package me.horzwxy.app.pfm.model.communication;

import com.google.gson.Gson;

/**
 * Created by horz on 10/1/13.
 */
public abstract class Request {

    protected static Gson gson = new Gson();

    public String toPostContent() {
        if( this.getClass().equals( Request.class ) ) {
            throw new RuntimeException( "This method cannot be called throw a supertype instance." );
        }
        return gson.toJson( this );
    }

    public static <T extends Request> T parseRequest( String jsonString, Class< T > requestClass ) {
        return gson.fromJson( jsonString, requestClass );
    }

    public abstract String getServlePattern();
}
