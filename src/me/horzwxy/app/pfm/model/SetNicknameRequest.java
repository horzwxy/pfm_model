package me.horzwxy.app.pfm.model;

/**
 * Created by horz on 9/14/13.
 */
public class SetNicknameRequest extends Request< User > {

    public static final String NICKNAME_KEY = "nickname";

    public SetNicknameRequest(User attachment) {
        super(RequestType.SetNickname, attachment);
    }

    @Override
    public String getPostContent() {
        return NICKNAME_KEY + "=" + attachment.nickname;
    }
}
