package com.evs.echarge.common.util;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;

import androidx.annotation.StringRes;

/**
 * 对话框工具类，主要展示loading类对话框
 * TODO 整个工具类需要实现
 * @author Jcking
 * @time 2019/10/28 15:09
 */
public class DialogUtils {

    public static Dialog showLoadingDialog(Activity activity){
        return null;
    }

    public static Dialog showLoadingDialog(Activity activity, @StringRes int msg){
        return showLoadingDialog(activity, activity.getString(msg));
    }

    public static Dialog showLoadingDialog(Activity activity, String msg){
        return null;
    }

    public static void dismissLoadingDialog(Activity activity){

    }
}
