package com.example.mvp_app.Login;

import android.util.Log;

import com.example.mvp_app.BaseMvp.BaseModel;
import com.example.mvp_app.BaseMvp.BasePersenter;

public class LoginPresenter extends BasePersenter<BaseViewImp> {
    private String TAG = getClass().getSimpleName();

    public void get(){
        baseModel.get(new BaseModel.getBase() {
            @Override
            public void OnSucces(String res) {
                baseView.Loigh(res);
                Log.e(TAG,res);
            }
        });
    }
}
