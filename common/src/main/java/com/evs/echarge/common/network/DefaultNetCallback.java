package com.evs.echarge.common.network;

/**
 * 默认网络回调
 * @author Jcking
 * @time 2019-10-30 12:59
 */
public abstract class DefaultNetCallback<T> implements INetCallback<T> {

    @Override
    public void onPreLoad() {

    }

    @Override
    public boolean onPreExcute(String result) {
        return false;
    }
}
