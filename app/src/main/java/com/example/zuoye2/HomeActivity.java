package com.example.zuoye2;

import android.util.Log;
import android.widget.TextView;

import com.example.mvplibrary.base.BaseActivity;
import com.example.mvplibrary.utils.net.URLConstant;
import com.example.zuoye2.bean.UserBean;
import com.example.zuoye2.contract.MainContract;
import com.example.zuoye2.presenter.MainPresenter;

public class HomeActivity extends BaseActivity<MainPresenter> implements MainContract.IMainView {

    private TextView title;

    @Override
    protected void initData() {
        presenter.loginResult(URLConstant.NEW_LIST);
    }

    @Override
    protected void initView() {
        title = findViewById(R.id.title);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_home;
    }

    @Override
    public MainPresenter add() {
        return new MainPresenter();
    }

    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public void getLoginData(UserBean userBean) {
        Log.d("忆梦", "getLoginData: " + userBean.getNews().toString());
        title.setText(userBean.getNews().get(0).getContent());
    }
}