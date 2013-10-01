package me.horzwxy.app.pfm.model.communication;

/**
 * Created by horz on 10/1/13.
 */
public class ResponsePackage< T extends ResponseContent > {

    public ClientRequestType type;
    public T attachment;
}
