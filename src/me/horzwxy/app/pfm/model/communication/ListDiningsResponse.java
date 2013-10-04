package me.horzwxy.app.pfm.model.communication;

import java.util.ArrayList;

import me.horzwxy.app.pfm.model.data.Dining;

/**
 * Created by horz on 10/3/13.
 */
public class ListDiningsResponse extends Response {

    public ArrayList<Dining> dinings;

    public ListDiningsResponse() {

    }

    public ListDiningsResponse( ArrayList<Dining> dinings ) {
        this.dinings = dinings;
    }
}
