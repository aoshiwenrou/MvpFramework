package com.evs.echarge.common.framework.m;

import android.text.TextUtils;

import androidx.lifecycle.LifecycleObserver;

import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.JsonUtils;
import com.blankj.utilcode.util.LogUtils;
import com.evs.echarge.common.network.BaseResponseBean;
import com.evs.echarge.common.network.INetCallback;
import com.evs.echarge.common.network.NetError;
import com.evs.echarge.common.util.AssertUtils;

import java.lang.reflect.Type;
import java.net.ResponseCache;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * @author Jcking
 * @time 2019/10/28 16:16
 */
public class BaseModel implements IModel {

    private CompositeDisposable compositeDisposable;

    private void addDisposable(Disposable d) {
        if(compositeDisposable == null)
            compositeDisposable = new CompositeDisposable();
        compositeDisposable.add(d);
    }

    private void removeDisposable(Disposable d){
        if(compositeDisposable == null)
            return;
        compositeDisposable.remove(d);
    }

    /**
     *
     * @param observable
     * @param clazz
     * @param isBase
     * @param callback
     */
    public void excuteObserver(Observable<String> observable, final Type clazz, final boolean isBase, final INetCallback callback){
        // 加载之前预处理
        if(callback != null)
            callback.onPreLoad();

        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<String>() {

                    private Disposable mDisposable;

                    @Override
                    public void onSubscribe(Disposable d) {
                        mDisposable = d;
                        addDisposable(d);
                    }

                    @Override
                    public void onNext(String s) {
                        // 事件已经注销，不继续处理
                        AssertUtils.checkTrue(mDisposable.isDisposed());
                        // 返回结果为空，不继续处理
                        AssertUtils.checkNull(callback);
                        AssertUtils.checkEmpty(s);
                        // 拦截处理，不继续处理
                        AssertUtils.checkTrue(callback.onPreExcute(s));

                        // 是base形式的请求
                        if(isBase){
                            excuteBaseResponse(s, clazz, callback);
                        }else{
                            excuteOtherResponse(s, clazz, callback);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    /**
     * 处理基础响应
     * @param s
     * @param clazz
     * @param callback
     */
    private void excuteBaseResponse(String s, Type clazz, INetCallback callback) {
        BaseResponseBean response = GsonUtils.fromJson(s, clazz);
        if(response.isSuccess()){
            callback.onExcute(response.getData());
        }else{
            callback.onError(new NetError(response));
        }
    }

    /**
     * 处理其他响应，主要用于处理第三方接口
     * @param s
     * @param clazz
     * @param callback
     */
    private void excuteOtherResponse(String s, Type clazz, INetCallback callback) {
    }

    @Override
    public void onDestroy() {
        //可以做一些 统一的处理
    }
}
