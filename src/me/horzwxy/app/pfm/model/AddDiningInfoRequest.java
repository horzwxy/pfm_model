package me.horzwxy.app.pfm.model;

public class AddDiningInfoRequest extends Request< Dining > {

	public static final String RESTAURANT_KEY = "restaurant";
	public static final String DATE_KEY = "date";
	public static final String COST_KEY = "cost";
	public static final String PARTICIPANTS_KEY = "participants";
	public static final String SPECIALCOSTS_KEY = "specialCosts";
	public static final String PAIDS_KEY = "paids";
	public static final String AUTHOR_KEY = "author";
	
	public AddDiningInfoRequest( Dining attachment ) {
		super( RequestType.AddDiningInfo, attachment );
	}
	
	@Override
	public String getPostContent() {
        return RESTAURANT_KEY + "=" + attachment.restaurant
                + "&" + DATE_KEY + "=" + Dining.dateFormat.format( attachment.date )
                + "&" + COST_KEY + "=" + attachment.cost
                + "&" + PARTICIPANTS_KEY + "=" + attachment.participantsToString()
                + "&" + SPECIALCOSTS_KEY + "=" + attachment.userCostMapToString( attachment.specialCosts )
                + "&" + PAIDS_KEY + "=" + attachment.userCostMapToString( attachment.paids )
                + "&" + AUTHOR_KEY + "=" + attachment.author.nickname;
	}

}
