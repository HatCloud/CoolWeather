package com.jeff.coolweather.util;

/**
 * Created by Jeff on 15/4/7.
 */
public interface HttpCallbackListener{
    void onFinish(String response);

    void onError(Exception e);
}
