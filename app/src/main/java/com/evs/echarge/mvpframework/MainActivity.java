package com.evs.echarge.mvpframework;

import com.evs.echarge.common.framework.v.BaseMvpActivity;
import com.evs.echarge.network.HttpSettings;

public class MainActivity extends BaseMvpActivity<MainPresenter> {

    @Override
    protected void initPreData() {
        super.initPreData();
        HttpSettings.getInstance()
                .setBaseUrl("https://restapi.amap.com/v3/")
//                .addInterceptor(new SessionInterceptor(this))
//                .addInterceptor(new CookieAddInterceptor(this))
//                .addInterceptor(new CookieGetInterceptor(this))
                .setShowLog(BuildConfig.DEBUG)
                .commit();
    }

    @Override
    protected void initData() {
        super.initData();
        getPresenter().getList();
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    public void showError(String msg) {

    }
}
