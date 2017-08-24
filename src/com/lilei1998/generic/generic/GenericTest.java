package com.lilei1998.generic.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lilei on 2017/8/24 下午6:45.
 */
public class GenericTest {

    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add("sansa");
//        list.add("arya");
//        list.add(100);
//        for (int i = 0; i < list.size(); i++) {
//            String name = (String) list.get(i); // 出现 ClassCastException 异常
//            System.out.println("name: " + name);
//        }

        List<String> list = new ArrayList<>();  // 采用泛型的写法
        list.add("Sansa");
        list.add("Arya");
//        list.add(100);   //  不能添加 Integer 类型
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            System.out.println("name: " + name);
        }
    }
}


