package com.example.zuoye2.contract;

import com.example.mvplibrary.base.BaseModel;
import com.example.mvplibrary.base.BaseView;
import com.example.mvplibrary.utils.net.Callback;
import com.example.zuoye2.bean.UserBean;

public class MainContract {
    public interface IMainModel extends BaseModel {
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
