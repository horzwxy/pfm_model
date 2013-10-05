package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.User;

public class ListBillsRequest extends Request {

	public String nickname;
	
	public ListBillsRequest() {
		
	}
	
	public ListBillsRequest( User user ) {
		this.nickname = user.nickname;
	}
	
	public User getUser() {
		return new User( nickname );
	}
	
	@Override
	public String getServlePattern() {
		// TODO Auto-generated method stub
		return "/listbills";
	}

}
