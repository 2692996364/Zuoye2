package com.example.mvplibrary.utils.net;

import java.util.HashMap;

//第三次
public interface WorkInterface {
    <T> void get(String url, Callback<T> callback);
    <T> void post(String url, Callback<T> callback);
    <T> void posts(String url, HashMap<String, String> map, Callback<T> callback);
}