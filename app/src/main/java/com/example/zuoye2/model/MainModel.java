package com.example.zuoye2.model;

import com.example.zuoye2.contract.MainContract;
import com.example.zuoye2.net.Callback;
import com.example.zuoye2.net.RetrofitUtils;

public class MainModel implements MainContract.IMainModel {
    private MainContract.IMainPresenter presenter;

    public MainModel(MainContract.IMainPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public <T> void getLoginData(String url, Callback<T> callback) {
        RetrofitUtils.getInstance().get(url, callback);
    }
}
