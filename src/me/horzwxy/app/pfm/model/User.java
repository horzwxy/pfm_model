package me.horzwxy.app.pfm.model;

public class User {

	public String email;
	public String nickname;
	
	@Override
	public String toString() {
		return "[User] email=\"" + email + "\" nickname=\"" + nickname + "\"";
	}
}
