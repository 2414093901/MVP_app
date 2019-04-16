package com.example.mvp_app.Login;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.ImageView;

import com.example.mvp_app.BaseMvp.BaseAcitivity;
import com.example.mvp_app.R;

public class MainActivity extends BaseAcitivity<BaseViewImp,LoginPresenter> implements BaseViewImp{
    private String TAG = getClass().getSimpleName();


    private Toolbar toolbar;
    private TabLayout tab;
    private ImageView img_btn;
    private void assignViews() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tab = (TabLayout) findViewById(R.id.tab);
        img_btn = (ImageView)findViewById(R.id.img_btn);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();
        basePersenter.get();

    }

    @Override
    protected BaseViewImp getBindView() {
        return this;
    }

    @Override
    protected LoginPresenter createPresender() {
        return new LoginPresenter();
    }


    @Override
    public void Loigh(String res) {
        Log.e(TAG,res);
        //V层获得数据,对数据做操作
    }
}
