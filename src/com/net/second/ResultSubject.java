package com.net.second;


/**
 * Created by daidaijie on 2016/1/25.
 */
public class ResultSubject implements Subject {

    @Override
    public void Request() {
        System.out.println("真实的请求");
    }
}
