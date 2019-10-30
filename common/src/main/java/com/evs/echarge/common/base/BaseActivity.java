package com.evs.echarge.common.base;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import com.blankj.utilcode.util.BarUtils;
import com.evs.echarge.common.util.DialogUtils;

/**
 * BaseActivity。
 * 这里没有对Activity的入栈、出栈等进行管理，因为Blankj的ActivityUtils已经进行了处理
 *
 * @author Jcking
 * @time 2019/10/28 15:02
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        if (isStatusBarTranslate())
            setStatusBarTranslate();
        super.onCreate(savedInstanceState);
        // 预留处理，子类可以自己处理onCreate
        if (!isCustomCreate()) {
            setContentView(getLayoutResId());
            initPreData();
            initView(savedInstanceState);
            initData();
        }
    }

    //--------------------------- 初始化相关 ----------------------------------------------

    /**
     * 获取布局资源
     *
     * @return
     */
    protected abstract  @LayoutRes int getLayoutResId();

    /**
     * 在初始化view之前获取数据，一般是获取上一个页面传过来的intent extra
     */
    protected void initPreData() {
    }

    /**
     * 初始化View
     */
    protected void initView(Bundle savedInstanceState) {

    }

    /**
     * 初始化数据，一般是获取网络数据
     */
    protected void initData() {
    }

    /**
     * 是否自己处理onCreate逻辑
     *
     * @return
     */
    protected boolean isCustomCreate() {
        return false;
    }

    //--------------------------- 状态栏相关 ----------------------------------------------

    /**
     * 设置状态栏是否是浅色模式。如果true，状态栏的文字和图标会变为黑色
     *
     * @param isLightMode
     */
    protected void setStatusBarLightMode(boolean isLightMode) {
        BarUtils.setStatusBarLightMode(this, isLightMode);
    }

    /**
     * 是否为透明状态栏。可覆写此方法更改状态
     *
     * @return
     */
    protected boolean isStatusBarTranslate() {
        return true;
    }

    /**
     * 设置系统状态栏为透明
     */
    private void setStatusBarTranslate() {
        //5.0以上系统状态栏透明
        Window window = getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        window.getDecorView().setSystemUiVisibility((View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_LAYOUT_STABLE));
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(Color.TRANSPARENT);
    }

    //--------------------------- 通用事件 ----------------------------------------------

    public void showLoading(){
        DialogUtils.showLoadingDialog(this);
    }

    public void showLoading(@StringRes int msg){
        DialogUtils.showLoadingDialog(this, msg);
    }

    public void showLoading(String msg){
        DialogUtils.showLoadingDialog(this, msg);
    }

    public void dismissLoading(){
        DialogUtils.dismissLoadingDialog(this);
    }
}
