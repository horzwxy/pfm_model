package me.horzwxy.app.pfm.model.data;

import java.util.Comparator;

public class Cost extends PFMData {
	
	public int cost;	// in units of 0.1 yuan
    public String nickname;

    public Cost() {

    }

    public Cost( String costString, String nickname ) {
        this.cost = Integer.parseInt(costString);
        this.nickname = nickname;
    }

	public Cost( int cost, String nickname ) {
		this.cost = cost;
        this.nickname = nickname;
	}
	
	/**
	 * Create from RMB Yuan
	 * @param cost
	 */
	public Cost( float cost, String nickname ) {
		this.cost = ( int ) cost * 10;
        this.nickname = nickname;
	}
	
	public float toYuan() {
		return cost / 10.f;
	}

    @Override
    public String toString() {
        return cost + "";
    }
    
    public static class CostComparator implements Comparator< Cost > {

		@Override
		public int compare(Cost o1, Cost o2) {
			return o1.cost - o2.cost;
		}
    	
    }
}
