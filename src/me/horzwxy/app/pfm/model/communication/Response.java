package me.horzwxy.app.pfm.model.communication;

import com.google.gson.Gson;

/**
 * Created by horz on 10/2/13.
 */
public abstract class Response {

	protected static Gson gson = new Gson();

    public String toPostContent() {
        if( this.getClass().equals( Response.class ) ) {
            throw new RuntimeException( "This method cannot be called throw a supertype instance." );
        }
        return gson.toJson( this );
    }

    public static <T extends Response> T parseResponse( String jsonString, Class< T > responseClass ) {
        return gson.fromJson( jsonString, responseClass );
    }

    @Override
    public String toString() {
        return gson.toJson( this );
    }
}
