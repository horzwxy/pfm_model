package me.horzwxy.app.pfm.model.data;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by horz on 10/4/13.
 */
public class CostList implements Serializable, Iterable<Cost> {

    private static Gson gson = new Gson();
    public ArrayList< Cost > costs;

    public CostList() {
        costs = new ArrayList<Cost>();
    }

    public String toJsonString() {
        return gson.toJson( this );
    }

    public static CostList fromJsonString( String jsonString ) {
        return gson.fromJson( jsonString, CostList.class );
    }

    public void add( Cost cost ) {
        this.costs.add( cost );
    }

    public void remove( Cost cost ) {
        this.costs.remove( cost );
    }

    public boolean contains( Cost cost ) {
        return this.costs.contains( cost );
    }

    public int size() {
        return this.costs.size();
    }

    @Override
    public String toString() {
        return gson.toJson( this );
    }

    @Override
    public Iterator<Cost> iterator() {
        return costs.iterator();
    }
}
