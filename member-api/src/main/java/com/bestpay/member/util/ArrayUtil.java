package com.bestpay.member.util;

import java.util.*;

/**
 * @Author: Hu Yongpeng
 * @Description:
 * @Date: Created in 16:42 2018/12/7
 */
public class ArrayUtil {
    private static final String TAG = "ArrayUtil";

    public static Integer[] getIds(Integer[] a, Integer[] b) {
        //用来存放两个数组中相同的元素
        Set<Integer> same = new HashSet<Integer>();
        //用来存放数组a中的元素
        Set<Integer> temp = new HashSet<Integer>();

        for (int i = 0; i < a.length; i++) {
            //把数组a中的元素放到Set中，可以去除重复的元素
            temp.add(a[i]);
        }

        for (int j = 0; j < b.length; j++) {
            //把数组b中的元素添加到temp中
            //如果temp中已存在相同的元素，则temp.add（b[j]）返回false
            if (!temp.add(b[j])) {
                same.add(b[j]);
            }
        }
        return (Integer[]) same.toArray();
    }


    public static <T> List<T> compare(T[] t1, T[] t2) {
        List<T> list1 = Arrays.asList(t1);
        List<T> list2 = new ArrayList<T>();
        for (T t : t2) {
            if (!list1.contains(t)) {
                list2.add(t);
            }
        }
        return list2;
    }

}