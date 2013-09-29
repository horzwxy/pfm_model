package me.horzwxy.app.pfm.model;

/**
 * Created by horz on 9/26/13.
 */
public class AddContactRequest extends Request< ContactInfo > {

    public AddContactRequest( ContactInfo attachment ) {
        super( attachment );
    }

  @Override
  public String getServletPattern() {
    return "/addcontact";
  }
}
