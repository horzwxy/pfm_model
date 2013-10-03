package me.horzwxy.app.pfm.model.data;

public class Cost extends PFMData {
	
	public int cost;	// in units of 0.1 yuan

    public Cost() {

    }

    public Cost( String costString ) {
        this.cost = Integer.parseInt(costString);
    }

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

    @Override
    public String toString() {
        return cost + "";
    }
}
