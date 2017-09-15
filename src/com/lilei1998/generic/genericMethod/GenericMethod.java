package com.lilei1998.generic.genericMethod;

/**
 * Created by lilei on 2017/9/15 下午3:34.
 */
public class GenericMethod {
    public static <T> void out(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        out("findingsea");
        out(123);
        out(11.11);
        out(true);
    }
}
