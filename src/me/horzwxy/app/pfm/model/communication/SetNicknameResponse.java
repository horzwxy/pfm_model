package me.horzwxy.app.pfm.model.communication;

import java.util.Map;

import me.horzwxy.app.pfm.model.communication.RequestType;
import me.horzwxy.app.pfm.model.communication.Response;

/**
 * Created by horz on 9/14/13.
 */
public class SetNicknameResponse extends Response {

    public static final String SET_NICKNAME_TYPE_KEY = "type";

    private SetNicknameResponseType type;

    public SetNicknameResponse(SetNicknameResponseType type) {
        this.type = type;
    }

    public SetNicknameResponse(Map<String, String> responsePairs) {
        type = SetNicknameResponseType.valueOf(responsePairs.get(SET_NICKNAME_TYPE_KEY));
    }

    public SetNicknameResponseType getType() {
        return type;
    }

    @Override
    public String getPostContent() {
        return RESPONSE_TYPE_KEY + "=" + RequestType.SetNickname + "&" + SET_NICKNAME_TYPE_KEY + "=" + type;
    }

    public enum SetNicknameResponseType {
        SUCCESS,
        USED,
        FAILED;
    }
}
