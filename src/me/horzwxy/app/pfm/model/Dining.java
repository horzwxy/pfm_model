package me.horzwxy.app.pfm.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dining implements PFMData {
	
	public static SimpleDateFormat dateFormat;
	
	static {
		dateFormat = new SimpleDateFormat( "yyyy-MM-dd-hh-mm" );
	}
	
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
	
//	public String toKVPair() {
//		return "id=" + id
//				+ "&restaurant=" + restaurant
//				+ "&date=" + dateFormat.format(date)
//				+ "&cost=" + cost
//				+ "&participants=" + participantsToString()
//				+ "&specialCosts=" + userCostPairToString( specialCosts )
//				+ "&paids=" + userCostPairToString( paids )
//				+ "&author=" + author.nickname
//				+ "&state=" + state;
//	}
	
	public String participantsToString() {
		String result = "";
		for( User user : participants ) {
			result += user.nickname + ",";
		}
		return result.substring( 0, result.length() - 1 );
	}
	
	public static ArrayList< User > getParticipantsFromString( String string ) {
		String[] nicknames = string.split( "," );
		ArrayList< User > result = new ArrayList< User >();
		for( String nickname : nicknames ) {
			result.add( new User( null, nickname ) );
		}
		return result;
	}
	
	public String userCostPairToString( Map< User, Integer > map ) {
		String result = "";
		Set< User > keySet = map.keySet();
		for( User user : keySet ) {
			result += user.nickname + "#" + specialCosts.get( user ) + ",";
		}
		return result.substring( 0, result.length() - 1 );
	}
	
	public static Map< User, Integer > getUserCostPairFromString( String string ) {
		String[] pairs = string.split( "," );
		Map< User, Integer > result = new HashMap< User, Integer >();
		for( String pair : pairs ) {
			String[] elements = pair.split( "#" );
			result.put( new User( null, elements[0] ), Integer.parseInt( elements[1] ) );
		}
		return result;
	}
}
