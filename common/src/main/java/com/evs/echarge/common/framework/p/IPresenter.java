package com.evs.echarge.common.framework.p;

import androidx.lifecycle.LifecycleObserver;

import com.evs.echarge.common.framework.v.IView;

/**
 * @author Jcking
 * @time 2019/10/28 16:09
 */
public interface IPresenter<V extends IView> extends LifecycleObserver {
    /**
     * 绑定 View
     *
     * @param mView view
     */
    void attachView(V mView);

    /**
     * 解除 View
     */
    void detachView();
}
