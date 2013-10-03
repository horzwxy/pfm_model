package me.horzwxy.app.pfm.model.communication;

/**
 * Created by horz on 10/2/13.
 */
public class GetProfileRequest extends Request {

    public String nickname;

    public GetProfileRequest() {

    }

    public GetProfileRequest( String nickname ) {
        this.nickname = nickname;
    }

    @Override
    public String getServlePattern() {
        return "/getprofile";
    }
}
