package me.horzwxy.app.pfm.model.data;

/**
 * Created by horz on 10/2/13.
 */
public class Restaurant extends PFMData {
    public String name;

    public Restaurant() {

    }

    public Restaurant( String name ) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
