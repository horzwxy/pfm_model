package me.horzwxy.app.pfm.model.communication;

/**
 * Created by horz on 10/2/13.
 */
public class AddDiningResponse extends Response {

    public ResponseType type;

    public AddDiningResponse( ResponseType type ) {
        this.type = type;
    }

    public enum ResponseType {
        SUCCESS,
        FAILED;
    }
}
