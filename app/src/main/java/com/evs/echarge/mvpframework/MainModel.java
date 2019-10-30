package com.evs.echarge.mvpframework;

import com.evs.echarge.common.framework.m.BaseModel;
import com.evs.echarge.common.network.INetCallback;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

import io.reactivex.Observable;

/**
 * @author Jcking
 * @time 2019-10-30 11:19
 */
public class MainModel extends BaseModel {

    public void getList(INetCallback callback){
        Observable<String> observable = new MainService().getList();
        excuteObserver(observable, new TypeToken<ArrayList<PoiBean>>(){}.getType()
                , true, callback);
    }

}
