package com.example.zuoye2.presenter;

import com.example.mvplibrary.base.BaseModel;
import com.example.mvplibrary.base.BasePresenter;
import com.example.mvplibrary.utils.net.Callback;
import com.example.zuoye2.bean.UserBean;
import com.example.zuoye2.contract.MainContract;
import com.example.zuoye2.model.MainModel;

public class MainPresenter extends BasePresenter<MainContract.IMainView, MainContract.IMainModel> implements MainContract.IMainPresenter {

    @Override
    public MainContract.IMainModel getiModel() {
        return new MainModel(this);
    }

    @Override
    public void login(String name, String password) {

    }

    @Override
    public void loginResult(String result) {
        iModel.getLoginData(result, new Callback<UserBean>() {
            @Override
            public void onSuccess(UserBean userBean) {
                iView.getLoginData(userBean);
            }

            @Override
            public void onFail(String msg) {

            }
        });
    }

}
