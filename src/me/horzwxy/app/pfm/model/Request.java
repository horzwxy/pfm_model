package me.horzwxy.app.pfm.model;

/**
 * Created by horz on 9/13/13.
 */
public abstract class Request< T extends PFMData > {

    protected RequestType type;
    protected T attachment;

    public Request( RequestType type, T attachment ) {
        this.type = type;
        this.attachment = attachment;
    }

    public RequestType getRequestType() {
        return type;
    }
    public T getAttachment() {
        return attachment;
    }

    public abstract String getPostContent();
}
