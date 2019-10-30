package com.evs.echarge.common.framework.v;

import android.os.Bundle;

import com.evs.echarge.common.base.BaseActivity;
import com.evs.echarge.common.framework.p.BasePresenter;
import com.evs.echarge.common.util.ClassUtils;

/**
 * @author Jcking
 * @time 10:40
 */
public abstract class BaseMvpActivity<P extends BasePresenter> extends BaseActivity implements IView {

    protected P mPresenter;

    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        mPresenter = createPresenter();
        if (mPresenter != null)
            mPresenter.attachView(this);
    }

    private P createPresenter() {
        Class clazz = ClassUtils.getTClass(getClass(), 0);
        try {
            P presenter = (P) clazz.newInstance();
            return presenter;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return null;
        }
    }

    protected P getPresenter(){
        return mPresenter;
    }
}
