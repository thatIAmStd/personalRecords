package com.dhy.personal.designpattern.creational.singleton.container;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;

/**
 * 容器单例
 *
 * @author ：denghaoyuan
 * @date ：create in 2020/8/4 20:30
 */
public class ContainerSingleton {

    private static HashMap<String, Object> map = new HashMap<>();

    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNotBlank(key) && null != instance) {
            if (!map.containsKey(key)) {
                map.put(key,instance);
            }
        }
    }

    public static Object getInstance(String key){
        return map.get(key);
    }
}
