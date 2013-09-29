package me.horzwxy.app.pfm.model;

import java.io.Serializable;

public class User implements PFMData, Serializable {

	public String accountName;
	public String nickname;
  public String accountType;
	
	public User( String email, String nickname, String accountType ) {
		this.accountName = email;
		this.nickname = nickname;
	}

  @Override
  public boolean equals( Object o ) {
      boolean result = false;
      if( o instanceof User ) {
        User user = ( User )o;
          if( this.accountType != null ) {
            if( !this.accountType.equals( user.accountType ) ) {
              return false;
            }
          }
          if( this.accountName != null ) {
              result |= this.accountName.equals( user.accountName );
          }
          if( this.nickname != null ) {
              result |= this.nickname.equals( user.nickname );
          }
      }
      return result;
  }
}
