package com.example.mvp_app.BaseMvp;

import android.util.Log;

public class BaseModel {
    private String TAG = getClass().getSimpleName();

    public interface getBase{
        void OnSucces(String res);
    }

    public void get(getBase getBase){
        String res = "login:获得数据";
        getBase.OnSucces(res);
        Log.e(TAG,res);
    }

    public void post(getBase getBase){
        String res = "register:获得数据";
        getBase.OnSucces(res);
        Log.e(TAG,res);
    }
}
