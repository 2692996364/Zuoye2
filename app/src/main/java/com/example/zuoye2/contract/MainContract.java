package com.example.zuoye2.contract;

import com.example.zuoye2.base.BaseView;
import com.example.zuoye2.bean.UserBean;
import com.example.zuoye2.net.Callback;

public class MainContract {
    public interface IMainModel {
        <T> void getLoginData(String url, Callback<T> callback);
    }
    public interface IMainPresenter {
        void login(String name, String password);
        void loginResult(String result);
    }
    public interface IMainView extends BaseView {
        String getUserName();
        String getPassword();
        void getLoginData(UserBean userBean);
    }
}
