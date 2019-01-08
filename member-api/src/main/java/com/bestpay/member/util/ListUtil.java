package com.bestpay.member.util;

import java.io.*;
import java.util.List;

/**
 * @Author: Hu Yongpeng
 * @Description:权益复制需要深拷贝
 * @Date: Created in 15:23 2018/12/7
 */
public class ListUtil {
    private static final String TAG = "ListUtil";

    public static <T> List<T> deepCopy(List<T> src) {
        try {
            ByteArrayOutputStream byteout = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(byteout);
            out.writeObject(src);
            ByteArrayInputStream bytein = new ByteArrayInputStream(byteout.toByteArray());
            ObjectInputStream in = new ObjectInputStream(bytein);
            @SuppressWarnings("unchecked")
            List<T> dest = (List<T>) in.readObject();
            return dest;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


}