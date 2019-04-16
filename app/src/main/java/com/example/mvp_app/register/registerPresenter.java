package com.example.mvp_app.register;

import com.example.mvp_app.BaseMvp.BaseModel;
import com.example.mvp_app.BaseMvp.BasePersenter;

public class registerPresenter extends BasePersenter<registerView> {
    private String TAG = getClass().getSimpleName();

    public void get(){
       baseModel.post(new BaseModel.getBase() {
           @Override
           public void OnSucces(String res) {
               baseView.Register(res);
           }
       });
    }
}
