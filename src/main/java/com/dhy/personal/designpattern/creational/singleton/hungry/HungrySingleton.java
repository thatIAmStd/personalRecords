package com.dhy.personal.designpattern.creational.singleton.hungry;

import java.io.Serializable;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/3 21:41
 */
public class HungrySingleton implements Serializable {

    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    /**
     * java在对对象序列化和反序列化时，会创建一个新的实例。然后，会用反射来查找是否包含此命名的方法，有的话就返回对象
     * 从而解决了序列化和反序列化的的问题
     */
    private Object readResolve() {
        return hungrySingleton;
    }
}
