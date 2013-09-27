package me.horzwxy.app.pfm.model;

/**
 * Created by horzwxy on 13-9-27.
 */
public class ListDiningRequest extends Request< User > {

    public static final String NICKNAME_KEY = "nickname";

    public ListDiningRequest( User user ) {
        super( RequestType.ListDining, user );
    }

    @Override
    public String getPostContent() {
        return NICKNAME_KEY + "=" + attachment.nickname;
    }
}
