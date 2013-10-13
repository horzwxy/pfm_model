package me.horzwxy.app.pfm.model.data;

public class User extends PFMData {

    public String accountName;
    public String nickname;
    public String accountType;  // maybe Google, Renren, Evernote or something else

    public User() {

    }

    public User(String accountName, String nickname, String accountType) {
        this.accountName = accountName;
        this.nickname = nickname;
        this.accountType = accountType;
    }
    
    public User( String accountName, String accountType ) {
    	this( accountName, null, accountType );
    }
    
    public User( String nickname ) {
    	this( null, nickname, null );
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (o instanceof User) {
            User user = (User) o;
            if (this.nickname != null) {
                result |= this.nickname.equals(user.nickname);
            }
            if (this.accountType != null) {
                if (!this.accountType.equals(user.accountType)) {
                    return false | result;
                }
            }
            if (this.accountName != null) {
                result |= this.accountName.equals(user.accountName);
            }
        }
        return result;
    }
}

