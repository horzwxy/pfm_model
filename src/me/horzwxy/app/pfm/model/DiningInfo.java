package me.horzwxy.app.pfm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class DiningInfo {
	
	public int id;
	public String restaurant;
	public Date date;
	public int cost;
	public ArrayList< User > participants;
	public Map< User, Integer > specialCosts;
	public Map< User, Integer > paids;
	public User author;
	public DiningInfoState state;
	
	public enum DiningInfoState {
		NOT_APPROVED,
		APPROVED,
		REJECTED;
	}
}
