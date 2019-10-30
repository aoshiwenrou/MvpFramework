package com.evs.echarge.common.network;

/**
 * @author Jcking
 * @time 2019/10/28 16:33
 */
public interface INetCallback<T> {

    /**
     * 在加载之前执行。
     */
    void onPreLoad();

    /**
     * 在处理返回结果前调用。如果返回true，则拦截事件，不在继续传递
     * @param result
     * @return
     */
    boolean onPreExcute(String result);

    /**
     * 处理返回结果。如果事件被onPreExcute拦截，则本方法不会被调用
     * @param response
     */
    void onExcute(T response);

    /**
     * 处理网络错误。返回true，表示处理了错误，且不在需要继续传递
     * @param error
     */
    boolean onError(NetError error);
}
