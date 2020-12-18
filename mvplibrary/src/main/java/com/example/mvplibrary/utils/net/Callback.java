package com.example.mvplibrary.utils.net;

public interface Callback<T> {
    void onSuccess(T t);
    void onFail(String msg);
}