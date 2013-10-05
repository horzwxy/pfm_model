package me.horzwxy.app.pfm.model.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class BillList implements Serializable, Iterable< Bill > {

	public ArrayList< Bill > list;
	
	public BillList() {
		this.list = new ArrayList< Bill >();
	}
	
	public BillList( ArrayList< Bill > list ) {
		this.list = list;
	}
	
	@Override
	public Iterator<Bill> iterator() {
		return list.iterator();
	}

    public int size() {
        return list.size();
    }

    public void add( Bill bill ) {
        list.add( bill );
    }

    public boolean contains( Bill bill ) {
        return list.contains( bill );
    }
}
