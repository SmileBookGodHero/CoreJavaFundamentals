package com.lilei1998.generic.pair1;


/**
 * Created by lilei on 2017/8/24 下午5:52.
 * 定义简单泛型类
 */
public class PairTest1 {
    public static void main(String[] args) {
        String[] words = {"Mary", "had", "a", "little", "lamb"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}

class ArrayAlg {
    public static Pair<String> minmax(String[] a) {  // 在普通类中定义泛型方法
        if (a == null || a.length == 0) {
            return null;
        }
        String min = a[0];
        String max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) {   // compareTo() 方法比较两个字符串，如果字符串相同则返回0；
                min = a[i];                  // 按字典顺序，第一个字符串比第二个靠前，返回负值，否则，返回正值
            }
            if (max.compareTo(a[i]) < 0) {
                max = a[i];
            }
        }
        return new Pair<>(min, max);
    }
}
