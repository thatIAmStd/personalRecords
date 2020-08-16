package com.dhy.personal.guava;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * @author ：denghaoyuan
 * @date ：create in 2020/8/10 16:41
 */
public class CollectionUtils {

    public static void main(String[] args) {
        Set<Integer> set1=Sets.newHashSet(1,2,3,4,5);
        Set<Integer> set2=Sets.newHashSet(3,4,5,6,7);

        //交集
        System.out.println("交集为：");
        Sets.SetView<Integer> intersection=Sets.intersection(set1, set2);
        for (Integer integer : intersection) {
            System.out.print(integer);
        }


        //差集
        System.out.println("差集为：");
        Sets.SetView<Integer> diff=Sets.difference(set1, set2);
        for (Integer integer : diff) {
            System.out.print(integer);
        }
        //并集
        System.out.println("并集为：");
        Sets.SetView<Integer> union=Sets.union(set1, set2);
        for (Integer integer : union) {
            System.out.print(integer);
        }

        //相对差集
        System.out.println("相对差集：");
        Sets.SetView<Integer> symmetricDifference =Sets.symmetricDifference (set1, set2);
        for (Integer integer : symmetricDifference) {
            System.out.print(integer);
        }
    }
}
