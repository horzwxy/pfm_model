package me.horzwxy.app.pfm.model.communication;

import com.google.gson.Gson;

import me.horzwxy.app.pfm.model.data.PFMData;

/**
 * Created by horz on 9/13/13.
 */
public class Request< T extends PFMData > {

    private T attachment;
    private RequestType type;

    public Request(T attachment) {
        this.attachment = attachment;
    }
}
