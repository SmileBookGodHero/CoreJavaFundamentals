package com.lilei1998.collection.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by lilei on 2017/8/31 下午2:12.
 * 链表的用法
 */
public class LinkedListTest {
    public static void main(String[] args) {
        List<String> a = new LinkedList<>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        List<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("France");
        b.add("Gloria");

        // 把 b 并入 a

        ListIterator<String> aIterator = a.listIterator();
        Iterator<String> bIterator = b.iterator();

        while (bIterator.hasNext()) {
            if (aIterator.hasNext()) {
                aIterator.next();
            }
            aIterator.add(bIterator.next());
        }

        System.out.println(a);
        System.out.println(b);

        bIterator = b.iterator();
        while (bIterator.hasNext()) {
            bIterator.next();
            if (bIterator.hasNext()) {
                bIterator.next();
                bIterator.remove();
            }
        }

        System.out.println(b);

        a.removeAll(b);

        System.out.println(a);
    }
}
