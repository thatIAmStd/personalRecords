package com.dhy.personal.designpattern.creational.prototype;

import lombok.Data;

import java.util.Date;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/5 22:21
 */
@Data
public class Tank implements Cloneable{

    private String color;

    private String size;

    private Date createDate;

    @Override
    public String toString() {
        return "Tank{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", createDate=" + createDate +
                '}'+hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        //加了这句就是深拷贝
        this.createDate = (Date) this.createDate.clone();
        return super.clone();
    }
}
