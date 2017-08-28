package com.lilei1998.generic.pair1;

/**
 * Created by lilei on 2017/8/25 上午10:14.
 * 泛型类：只关注泛型，不为数据存储的细节烦恼
 */

public class Pair<T> {  //  引入类型变量 T
    private T first;    //  类型变量指定方法的返回类型以及域和局部变量的类型
    private T second;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T newValue) {
        first = newValue;
    }

    public void setSecond(T newValue) {
        second = newValue;
    }
}
