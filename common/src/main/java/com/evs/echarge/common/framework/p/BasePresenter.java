package com.evs.echarge.common.framework.p;

import com.evs.echarge.common.framework.m.IModel;
import com.evs.echarge.common.framework.v.IView;
import com.evs.echarge.common.util.AssertUtils;
import com.evs.echarge.common.util.ClassUtils;

/**
 * @author Jcking
 * @time 2019/10/28 16:16
 */
public class BasePresenter <M extends IModel, V extends IView> implements IPresenter<V> {

    private V mView;
    private M mModel;

    public BasePresenter(){
        mModel = createModel();
    }

    private M createModel() {
        Class clazz = ClassUtils.getTClass(getClass(), 0);
        try {
            M model = (M) clazz.newInstance();
            return model;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return null;
        }
    }

    public V getView(){
        return mView;
    }

    public M getModel(){
        return mModel;
    }

    @Override
    public void attachView(V view) {
        this.mView = view;
        AssertUtils.checkNull(mModel);
        AssertUtils.checkNull(mView);
        mView.getLifecycle().addObserver(mModel);
    }

    @Override
    public void detachView() {
        if(mView == null){
            this.mModel = null;
        }else if(mModel == null){
            mView = null;
        }else{
            mView.getLifecycle().removeObserver(mModel);
            this.mView = null;
            this.mModel = null;
        }
    }
}
