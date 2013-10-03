package me.horzwxy.app.pfm.model.data;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * Created by horz on 10/3/13.
 */
public abstract class PFMData implements Serializable {

    @Override
    public String toString() {
        return new Gson().toJson( this );
    }
}
