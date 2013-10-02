package me.horzwxy.app.pfm.model.data;

/**
 * Created by horz on 10/2/13.
 */
public class Cost {
    int cost;   // in unit of 0.1 RMB Yuan

    public float toYuan() {
        return cost / 10f;
    }

    public void setCostFromYuan( float yuan ) {
        this.cost = (int)(yuan * 10);
    }
}
