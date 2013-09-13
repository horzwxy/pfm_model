package me.horzwxy.app.pfm.model.tool;

import java.util.Map;

import me.horzwxy.app.pfm.model.LogInResponse;
import me.horzwxy.app.pfm.model.LogInResponseType;
import me.horzwxy.app.pfm.model.User;

/**
 * Created by horz on 9/13/13.
 */
public class LogInMessage {

    public static String getLogInRequest( User user ) {
        return user.toKVPair();
    }

    public static String getLogInResponse( LogInResponseType type, String nickname ) {
        return "response=" + type.toString() + "&nickname=" + nickname;
    }

    public static LogInResponse parseLogInResponse( String response ) {
        Map< String, String > responseMap = Tool.parseResponse( response );
        LogInResponseType type = LogInResponseType.valueOf( responseMap.get( "response" ) );
        String nickname = responseMap.get( "nickname" );
        return new LogInResponse( type, nickname );
    }
}
