package com.evs.echarge.common.util;

import java.lang.reflect.ParameterizedType;

/**
 * @author Jcking
 * @time 2019/10/28 16:40
 */
public class ClassUtils {

    public static class Test<T>{
        public T t;
    }

    public <T> T getTClass(Test<T> test){
        Class<T> clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        try {
            return clazz.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
//        ClassUtils utils = new ClassUtils();
//        Object object = utils.getTClass(new Test<Integer>());
        System.out.println("-------->");
//        System.out.println(object);
    }
}
