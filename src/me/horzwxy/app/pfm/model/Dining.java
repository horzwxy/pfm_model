package me.horzwxy.app.pfm.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dining implements PFMData {
	
	public static SimpleDateFormat dateFormat;
	
	private static int accu_int = 0;
	
	static {
		dateFormat = new SimpleDateFormat( "yyyy-MM-dd-HH-mm" );
	}

    {
        this.state = DiningInfoState.NOT_APPROVED;
        participants = new ArrayList<User>();
        specialCosts = new HashMap<User, Integer>();
        paids = new HashMap<User, Integer>();
    }

	public Dining() {
		this.id = accu_int++;
	}
	
	public Dining( int id ) {
		this.id = id;
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
	
	public String userCostMapToString( Map< User, Integer > map ) {
		String result = "";
		Set< User > keySet = map.keySet();
        if( keySet.size() == 0 ) {
            return result;
        }
		for( User user : keySet ) {
			result += user.nickname + "#" + specialCosts.get( user ) + ",";
		}
		return result.substring( 0, result.length() - 1 );
	}
	
	public static Map< User, Integer > getUserCostMapFromString( String string ) {
		String[] pairs = string.split( "," );
		Map< User, Integer > result = new HashMap< User, Integer >();
		if( !string.contains( "," ) ) {
			return result;
		}
		for( String pair : pairs ) {
			String[] elements = pair.split( "#" );
			result.put( new User( null, elements[0] ), Integer.parseInt( elements[1] ) );
		}
		return result;
	}
}
