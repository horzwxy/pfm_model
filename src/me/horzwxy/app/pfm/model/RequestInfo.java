package me.horzwxy.app.pfm.model;

/**
 * Created by horz on 9/13/13.
 */
public class RequestInfo {

    private RequestType type;
    private Stringizable attachment;

    public RequestInfo( RequestType type, Stringizable attachment ) {
        this.type = type;
        this.attachment = attachment;
    }

    public RequestType getRequestType() {
        return type;
    }
    public Stringizable getAttachment() {
        return attachment;
    }
}
