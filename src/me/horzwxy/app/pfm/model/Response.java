package me.horzwxy.app.pfm.model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by horz on 9/13/13.
 */
public abstract class Response<T extends Response> {

  protected Gson gson;
  protected Class<T> thisClass;

  protected Response(Class<T> thisClass) {
    this.thisClass = thisClass;
  }

  public T parseResponse(String gsonString) {
    return gson.fromJson(gsonString, thisClass);
  }

  public abstract String getPostContent();
}
