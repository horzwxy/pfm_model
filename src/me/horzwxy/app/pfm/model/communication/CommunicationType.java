package me.horzwxy.app.pfm.model.communication;

/**
 * Created by horz on 10/2/13.
 */
public enum CommunicationType {

    LogIn( "/login" ),
    SetNickname( "/setnickname" ),
    GetProfile( "/getprofile" ),
    AddContact( "/addcontact" ),
    RemoveContact( "/removecontact" ),
    AddDining( "/adddining" ),
    ListDinings( "/listdinings" ),
    ViewDining( "/viewDining" ),
    ReviewDining( "/reviewdining" ),
    ListBills( "/listbills" ),
    GetBill( "/getbill" ),
    ReviewBill( "/reviewbill" ),
    ClearBill( "/clearbill" );

    public String servletPattern;

    CommunicationType( String servletPattern ) {
        this.servletPattern = servletPattern;
    }
}
