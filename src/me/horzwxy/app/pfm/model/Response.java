package me.horzwxy.app.pfm.model;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by horz on 9/13/13.
 */
public abstract class Response {

    public static final String RESPONSE_TYPE_KEY = "response-type";
    public static final String PACKAGE_NAME = Response.class.getName();

    private static Map< String, String > splitResponse( String response ) {
        Map< String, String > result = new HashMap< String, String >();
        String[] parts = response.split("&");
        for( String part : parts ) {
            String key = part.split("=")[0];
            String value = part.split("=")[1];
            result.put( key, value );
        }
        return result;
    }

    public static Response parseResponse( String response ) {
        Map< String, String > map = splitResponse( response );
        Response result = null;
        try {
            Class< ? extends Response > responseClass =
                    (Class<? extends Response>) Class.forName(
                            PACKAGE_NAME + "." + map.get("response-type") + "Response" );
            Constructor< ? extends Response > constructor = responseClass.getConstructor(String.class);
            result = constructor.newInstance(response);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return result;
    }

    public abstract String getPostContent();
}
