package com.net.second;

/**
 * Created by daidaijie on 2016/1/25.
 */
public class Proxy implements Subject {

    ResultSubject resultSubject;

    @Override
    public void Request() {
        if (resultSubject == null) {
            resultSubject = new ResultSubject();
        }
        resultSubject.Request();
    }
}
