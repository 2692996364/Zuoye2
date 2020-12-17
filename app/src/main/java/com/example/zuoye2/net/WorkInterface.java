package com.example.zuoye2.net;

import java.util.HashMap;

public interface WorkInterface {
    <T> void get(String url, Callback<T> callback);
    <T> void post(String url, Callback<T> callback);
    <T> void posts(String url, HashMap<String, String> map, Callback<T> callback);
}