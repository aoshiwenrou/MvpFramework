package com.evs.echarge.network.request;

import com.evs.echarge.network.HttpSettings;

import java.util.Map;

import io.reactivex.Observable;

/**
 * 各模块进行网络请求的基础类
 *
 * @author Jcking
 * @time 2019/3/10 00:15
 */
public class BaseNetService {

    /**
     * 获取BaseUrl，默认为{@link HttpSettings}中设置的baseurl。
     * 如果整个模块都要引用第三方url，可以覆写此方法。
     * 如果某个请求为第三方url，可以使用三个参数的请求方法。
     * @return
     */
    protected String getBaseUrl() {
        return HttpSettings.getInstance().getBaseUrl();
    }

    public Observable<String> get(String url, Map<String,Object> params){
        return get(getBaseUrl(), url, params);
    }

    public Observable<String> get(String base, String url, Map<String,Object> params){
        return HttpRequester.get().doGet(base, url, params);
    }

    public Observable<String> postForm(String url, Map<String,Object> params){
        return postForm(getBaseUrl(), url, params);
    }

    public Observable<String> postForm(String base, String url, Map<String,Object> params){
        return HttpRequester.get().doPostForm(base, url, params);
    }

    public Observable<String> postJson(String url, Object params){
        return postJson(getBaseUrl(), url, params);
    }

    public Observable<String> postJson(String base, String url, Object params){
        return HttpRequester.get().doPostJson(base, url, params);
    }
}
