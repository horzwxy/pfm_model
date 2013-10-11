package me.horzwxy.app.pfm.model.communication;

import java.util.ArrayList;

import me.horzwxy.app.pfm.model.data.Dining;

/**
 * Created by horz on 10/3/13.
 */
public class ListDiningsResponse extends Response {

    public ArrayList<Dining> dinings;	// null stands for no dinings to show

    /**
	 * Leave for gson to instantialize this class.
	 * For coder, never try to call this constructor.
	 */
    public ListDiningsResponse() {}

    public ListDiningsResponse( ArrayList<Dining> dinings ) {
        this.dinings = dinings;
    }
}
