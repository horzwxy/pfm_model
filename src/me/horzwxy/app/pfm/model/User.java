package me.horzwxy.app.pfm.model;

import java.io.Serializable;

public class User implements PFMData, Serializable {

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
    public boolean equals( Object o ) {
        boolean result = false;
        if( o instanceof User ) {
            if( this.email != null ) {
                result |= this.email.equals( ((User) o).email );
            }
            if( this.nickname != null ) {
                result |= this.nickname.equals( ((User) o).nickname );
            }
        }
        return result;
    }

}
