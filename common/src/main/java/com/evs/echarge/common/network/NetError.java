package com.evs.echarge.common.network;

import com.blankj.utilcode.util.GsonUtils;
import com.evs.echarge.common.util.AssertUtils;

/**
 * @author Jcking
 * @time 23:05
 */
public class NetError extends BaseResponseBean<String> {

    public NetError(){
        setStatus(FAILED);
    }

    public NetError(BaseResponseBean response){
        AssertUtils.checkNull(response);
        setStatus(response.getStatus());
        setMessage(response.getMessage());
        setTimestamp(response.getTimestamp());
        setData(response.getData() == null ? null : GsonUtils.toJson(response.getData()));
    }
}
