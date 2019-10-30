package com.evs.echarge.common.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;

import com.evs.echarge.common.util.DialogUtils;

/**
 * BaseFragment
 *
 * @author Jcking
 * @time 2019/10/28 15:03
 */
public abstract class BaseFragment extends Fragment {

    private View rootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (rootView == null)
            rootView = inflater.inflate(getLayoutResId(), container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initPreData();
        initView(savedInstanceState);
        initData();
    }

    //--------------------------- 初始化相关 ----------------------------------------------

    /**
     * 获取布局资源
     *
     * @return
     */
    protected abstract @LayoutRes
    int getLayoutResId();

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

    //--------------------------- 判断登录 ----------------------------------------------

    public boolean isUserLogin() {
        // TODO 判断用户是否登录
        return false;
    }

    public void checkLogin(ILoginCallback callback) {
        if (isUserLogin()) {
            callback.onLogined();
        } else {
            // TODO 跳转登录，继续做处理
        }
    }

    //--------------------------- 通用事件 ----------------------------------------------

    public void showLoading() {
        DialogUtils.showLoadingDialog(getActivity());
    }

    public void showLoading(@StringRes int msg) {
        DialogUtils.showLoadingDialog(getActivity(), msg);
    }

    public void showLoading(String msg) {
        DialogUtils.showLoadingDialog(getActivity(), msg);
    }

    public void dismissLoading() {
        DialogUtils.dismissLoadingDialog(getActivity());
    }
}
