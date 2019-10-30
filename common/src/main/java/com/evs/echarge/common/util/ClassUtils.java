package com.evs.echarge.common.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author Jcking
 * @time 2019-10-30 10:59
 */
public class ClassUtils {

    /**
     * 获取泛型参数
     * @param parent
     * @param position
     * @return
     */
    public static Class getTClass(Class parent, int position){
        //反射：第一步获取class
        //正在被调用的那个类的class，B继承A，B在运行的时候会调用这个方法,在运行中得到的是B.class
        //type的到的是参数化的类型B<具体类型>
        Type type = parent.getGenericSuperclass();
        //将type强转成参数化的类型：
        ParameterizedType pType = (ParameterizedType) type;
        //通过参数化类型获得实际类型参数：得到一个数组=>有可能是Map<String,Integer>
        Type[] types =pType.getActualTypeArguments();
        //获得第一个
        return (Class) types[position];
    }
}
