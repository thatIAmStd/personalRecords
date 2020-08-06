package com.dhy.personal.designpattern.constractor.facade;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/6 20:23
 */
@Data
@Accessors(chain =  true)
public class Book {

    private String name;
}
