package com.example.mvp_app.register;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.mvp_app.BaseMvp.BaseAcitivity;
import com.example.mvp_app.R;

public class Main2Activity extends BaseAcitivity<registerView,registerPresenter>implements registerView {
    private String TAG = getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        basePersenter.get();
    }

    @Override
    protected registerView getBindView() {
        return this;
    }

    @Override
    protected registerPresenter createPresender() {
        return new registerPresenter();
    }

    @Override
    public void Register(String res) {
        Log.e(TAG,res);
    }
}
