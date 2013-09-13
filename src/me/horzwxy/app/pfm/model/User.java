package me.horzwxy.app.pfm.model;

public class User implements Stringizable {

	public String email;
	public String nickname;
	
	public User( String email, String nickname ) {
		this.email = email;
		this.nickname = nickname;
	}
	
	@Override
	public String toString() {
		return "[User] email=\"" + email + "\" nickname=\"" + nickname + "\"";
	}
	
	@Override
	public String toKVPair() {
		return "email=" + email + "&nickname=" + nickname;
	}
}
