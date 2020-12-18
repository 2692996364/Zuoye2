package com.example.zuoye2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.mvplibrary.base.BaseActivity;
import com.example.zuoye2.bean.UserBean;
import com.example.zuoye2.contract.MainContract;
import com.example.zuoye2.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.IMainView, View.OnClickListener {

    private EditText user_name;
    private EditText pass_word;
    private ImageView img;
    private Button btn;

    @Override
    protected void initData() {
        presenter.login(getUserName(), getPassword());
    }

    @Override
    protected void initView() {
        img = findViewById(R.id.img);
        user_name = findViewById(R.id.user_name);
        pass_word = findViewById(R.id.pass_word);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public MainPresenter add() {
        return new MainPresenter();
    }

    @Override
    public String getUserName() {
        return user_name.getText().toString();
    }

    @Override
    public String getPassword() {
        return pass_word.getText().toString();
    }

    @Override
    public void getLoginData(UserBean userBean) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn:
                if (getUserName().equals("2692996364") && getPassword().equals("wang123456")) {
                    Intent intent = new Intent(this, HomeActivity.class);
                    startActivity(intent);
                } else if (getUserName().isEmpty() || getPassword().isEmpty()) {
                    Toast.makeText(this, "账号或密码为空", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "账号或密码不正确", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}