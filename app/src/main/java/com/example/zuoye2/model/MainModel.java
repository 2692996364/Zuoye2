package com.example.zuoye2.model;

import com.example.mvplibrary.utils.net.Callback;
import com.example.mvplibrary.utils.net.RetrofitUtils;
import com.example.zuoye2.contract.MainContract;

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
