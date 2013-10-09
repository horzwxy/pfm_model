package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.Dining;

/**
 * Created by horz on 10/2/13.
 */
public class AddDiningRequest extends Request {

    public Dining dining;

    /**
	 * Leave for gson to instantialize this class.
	 * For coder, never try to call this constructor.
	 */
    public AddDiningRequest() {}

    public AddDiningRequest( Dining dining ) {
        this.dining = dining;
    }

    @Override
    public String getServlePattern() {
        return "/adddining";
    }
}
