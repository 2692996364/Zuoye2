package com.example.zuoye2.net;

public interface Callback<T> {
    void onSuccess(T t);
    void onFail(String msg);
}