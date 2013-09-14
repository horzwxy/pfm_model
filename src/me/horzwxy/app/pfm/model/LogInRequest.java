package me.horzwxy.app.pfm.model;

/**
 * Created by horz on 9/14/13.
 */
public class LogInRequest extends Request< User > {

    public final static String EMAIL_KEY = "email";

    public LogInRequest(User attachment) {
        super(RequestType.LogIn, attachment);
    }

    @Override
    public String getPostContent() {
        return EMAIL_KEY + "=" + attachment.email;
    }
}
