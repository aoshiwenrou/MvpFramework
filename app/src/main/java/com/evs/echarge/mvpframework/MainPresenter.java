package com.evs.echarge.mvpframework;

import com.evs.echarge.common.framework.p.BasePresenter;
import com.evs.echarge.common.network.DefaultNetCallback;
import com.evs.echarge.common.network.NetError;

import java.util.ArrayList;

/**
 * @author Jcking
 * @time 2019-10-30 11:19
 */
public class MainPresenter extends BasePresenter<MainModel,MainActivity> {

    public void getList(){
        getModel().getList(new DefaultNetCallback<ArrayList<PoiBean>>() {
            @Override
            public void onExcute(ArrayList<PoiBean> response) {
                MainActivity view = getView();
            }

            @Override
            public boolean onError(NetError error) {
                MainActivity view = getView();
                return false;
            }
        });
    }
}
