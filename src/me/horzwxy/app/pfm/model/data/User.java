package me.horzwxy.app.pfm.model.data;

import java.io.Serializable;

public class User implements PFMData, Serializable {

    public String accountName;
    public String nickname;
    public String accountType;  // maybe Google, Renren, Evernote or something else

    public User(String accountName, String nickname, String accountType) {
        this.accountName = accountName;
        this.nickname = nickname;
        this.accountType = accountType;
    }
    
    public User( String accountName, String nickname ) {
    	this( accountName, nickname, null );
    }
    
    public User( String nickname ) {
    	this( null, nickname );
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (o instanceof User) {
            User user = (User) o;
            if (this.accountType != null) {
                if (!this.accountType.equals(user.accountType)) {
                    return false;
                }
            }
            if (this.accountName != null) {
                result |= this.accountName.equals(user.accountName);
            }
            if (this.nickname != null) {
                result |= this.nickname.equals(user.nickname);
            }
        }
        return result;
    }
}
