package me.horzwxy.app.pfm.model.data;

public class Cost {
	
	int cost;	// in units of 0.1 yuan
	
	public Cost( int cost ) {
		this.cost = cost;
	}
	
	/**
	 * Create from RMB Yuan
	 * @param cost
	 */
	public Cost( float cost ) {
		this.cost = ( int ) cost * 10;
	}
	
	public float toYuan() {
		return cost / 10.f;
	}
}
