package com.evs.echarge.common.util;

/**
 * 断言工具类
 * @author Jcking
 * @time 23:42
 */
public class AssertUtils {

    public static void checkNull(Object object){
        checkNull(object, "");
    }

    public static void checkNull(Object object, String msg){
        checkTrue(object == null, msg);
    }

    public static void checkEmpty(String text){
        checkEmpty(text, "");
    }

    public static void checkEmpty(String text, String msg){
        checkTrue(text == null || text.equals(""), msg);
    }

    public static void checkFalse(boolean falseCase){
        checkFalse(falseCase, "");
    }

    public static void checkFalse(boolean falseCase, String msg){
        if(!falseCase)
            throw new RuntimeException(msg);
    }

    public static void checkTrue(boolean trueCase){
        checkTrue(trueCase, "");
    }

    public static void checkTrue(boolean trueCase, String msg){
        if(trueCase)
            throw new RuntimeException(msg);
    }

}
