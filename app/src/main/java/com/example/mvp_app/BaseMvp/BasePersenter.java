package com.example.mvp_app.BaseMvp;

public class BasePersenter<V> {

    protected V baseView;
    protected BaseModel baseModel;

    public BasePersenter() {
        baseModel = new BaseModel();
    }

    public void OnBind(V baseView){
        this.baseView = baseView;
    }

    public void NoBind(){
        baseView = null;
    }
}
