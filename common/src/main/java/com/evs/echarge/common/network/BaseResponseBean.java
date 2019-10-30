package com.evs.echarge.common.network;

/**
 * 基础响应对象
 *
 * @author Jcking
 * @time 2019/10/28 17:11
 */
public class BaseResponseBean<T> {

    /** 请求失败 */
    public static final int FAILED = 0;
    /** 请求成功 */
    public static final int SUCCESS = 1;

    public boolean isSuccess(){
        return status == SUCCESS;
    }

    private int status;
    private String message;
    private long timestamp;
    private T data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
