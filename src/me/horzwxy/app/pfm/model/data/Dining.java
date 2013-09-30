package me.horzwxy.app.pfm.model.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Dining implements PFMData {

    public int id;
    public String restaurant;
    public Date date;
    public int cost;
    public ArrayList<User> participants;
    public Map<User, Integer> specialCosts;
    public Map<User, Integer> paids;
    public User author;
    public DiningState state;

    public Dining() {
        this.state = DiningState.NOT_APPROVED;
        participants = new ArrayList<User>();
        specialCosts = new HashMap<User, Integer>();
        paids = new HashMap<User, Integer>();
    }

    public enum DiningState {
        NOT_APPROVED,
        APPROVED,
        REJECTED;
    }
}
