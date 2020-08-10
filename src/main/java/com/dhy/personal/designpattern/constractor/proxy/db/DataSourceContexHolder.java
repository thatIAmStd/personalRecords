package com.dhy.personal.designpattern.constractor.proxy.db;

/**
 * 数据源上下文，放在线程变量里面
 *
 * @author ：denghaoyuan
 * @date ：create in 2020/8/9 19:19
 */
public class DataSourceContexHolder {

    private static final ThreadLocal<String> DATASOURCE_CONTEX = new ThreadLocal<>();

    public static void setDbType(String dataType) {
        DATASOURCE_CONTEX.set(dataType);
    }

    public static String getDbType() {
        return (String) DATASOURCE_CONTEX.get();
    }

    public static void clear() {
        DATASOURCE_CONTEX.remove();
    }

}
