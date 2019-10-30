package com.evs.echarge.network;

import com.evs.echarge.network.request.HttpRequester;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Interceptor;

/**
 * Http设置工具类，通常用在Application中，对Http请求进行全局设置
 *
 * @author Jcking
 * @time 2019/3/9 13:49
 */
public class HttpSettings {

    private boolean mShowLog = false;
    private boolean isUseSSL = false;
    private String mBaseUrl;
    private List<Interceptor> interceptors = new ArrayList<>();

    private static class Holder {
        private static HttpSettings singleton = new HttpSettings();
    }

    private HttpSettings() {
    }

    public static HttpSettings getInstance() {
        return Holder.singleton;
    }

    public HttpSettings setBaseUrl(String baseUrl) {
        mBaseUrl = baseUrl;
        return this;
    }

    public String getBaseUrl() {
        return mBaseUrl;
    }

    public HttpSettings addInterceptor(Interceptor interceptor) {
        interceptors.add(interceptor);
        return this;
    }

    public List<Interceptor> interceptors() {
        return interceptors;
    }

    /**
     * 设置是否显示log
     *
     * @author Jcking
     * @time 2017/5/27 11:23
     */
    public HttpSettings setShowLog(boolean showLog) {
        mShowLog = showLog;
        return this;
    }

    public boolean isShowLog() {
        return this.mShowLog;
    }

    public boolean isUseSSL() {
        return isUseSSL;
    }

    public void setUseSSL(boolean useSSL) {
        isUseSSL = useSSL;
    }

    /**
     * 提交修改，设置完其他的项，要提交才会起作用
     */
    public void commit() {
        HttpRequester.get().rebuild();
    }

    /**
     * 回收资源
     */
    public void recycle() {
        interceptors.clear();
        HttpRequester.get().clear();
    }
}
