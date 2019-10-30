package com.evs.echarge.common.framework.p;

import com.evs.echarge.common.framework.m.IModel;
import com.evs.echarge.common.framework.v.IView;

/**
 * @author Jcking
 * @time 2019/10/28 16:16
 */
public class BasePresenter <M extends IModel, V extends IView> implements IPresenter<V> {

    @Override
    public void attachView(V mView) {

    }

    @Override
    public void detachView() {

    }
}
