package com.evs.echarge.common.framework.m;

import androidx.lifecycle.LifecycleObserver;

/**
 * @author Jcking
 * @time 2019/10/28 16:09
 */
public interface IModel extends LifecycleObserver {

    /**
     * model 销毁
     */
    void onDestroy();
}
