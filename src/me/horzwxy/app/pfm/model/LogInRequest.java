package me.horzwxy.app.pfm.model;

/**
 * Created by horz on 9/14/13.
 */
public class LogInRequest extends Request<User> {

  public LogInRequest(User attachment) {
    super(attachment);
  }

  @Override
  public String getServletPattern() {
    return "/login";
  }
}
