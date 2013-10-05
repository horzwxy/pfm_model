package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.User;

/**
 * Created by horz on 10/5/13.
 */
public class ClearBillRequest extends Request {

    public User user;
    public long diningId;

    public ClearBillRequest() {

    }

    public ClearBillRequest( User user, long diningId ) {
        this.user = user;
        this.diningId = diningId;
    }

    @Override
    public String getServlePattern() {
        return "/clearbill";
    }
}
