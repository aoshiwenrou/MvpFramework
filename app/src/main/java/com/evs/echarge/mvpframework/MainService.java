package com.evs.echarge.mvpframework;

import com.evs.echarge.common.network.INetCallback;
import com.evs.echarge.network.request.BaseNetService;

import java.util.ArrayList;
import java.util.HashMap;

import io.reactivex.Observable;

/**
 * @author Jcking
 * @time 2019-10-30 11:22
 */
public class MainService extends BaseNetService {

    String url = "place/text";

    @Override
    protected String getBaseUrl() {
        return "https://restapi.amap.com/v3/";
    }

    Observable<String> getList(){
        HashMap<String, Object> params = new HashMap<>();
        params.put("key", "e9eafea51afc665eb5d8efd289e9f61b");
        params.put("keywords", "人济大厦");
        params.put("city", "北京");
        params.put("output", "json");
        params.put("page", "1");

        return get(url, params);
    }
}
