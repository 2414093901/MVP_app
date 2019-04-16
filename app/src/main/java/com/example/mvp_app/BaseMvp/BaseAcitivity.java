package com.example.mvp_app.BaseMvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract  class BaseAcitivity<V extends BaseView,P extends BasePersenter> extends AppCompatActivity {
    protected V baseView;
    protected P basePersenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        basePersenter = createPresender();
        baseView = getBindView();
        basePersenter.OnBind(baseView);
    }

    protected abstract V getBindView();//实例化V层
    protected abstract P createPresender();//实例化P层

    @Override
    protected void onDestroy() {
        super.onDestroy();
        basePersenter.NoBind();
    }
}
