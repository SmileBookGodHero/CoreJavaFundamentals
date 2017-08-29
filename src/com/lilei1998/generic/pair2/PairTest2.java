package com.lilei1998.generic.pair2;

import com.lilei1998.generic.pair1.Pair;

import java.time.LocalDate;

/**
 * Created by lilei on 2017/8/25 上午11:27.
 * 泛型：类型变量的限定
 */
public class PairTest2 {
    public static void main(String[] args) {
        LocalDate[] birthdays = {
                LocalDate.of(1906, 12, 9),  // G. Hopper
                LocalDate.of(1815, 12, 10), // A. Lovelace
                LocalDate.of(1903, 12, 3), // J. von Neumann
                LocalDate.of(1910, 6, 22), // K. Zuse
        };

        Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}

class ArrayAlg {
    @SuppressWarnings("unchecked")
    public static <T extends Comparable> Pair<T> minmax(T[] a) {   // 对类型变量设置限定，使用 compareTo() 方法   导入 Pair 类
        if (a == null || a.length == 0) {
            return null;
        }
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) {
                min = a[i];
            }
            if (max.compareTo(a[i]) < 0) {
                max = a[i];
            }
        }
        return new Pair<>(min, max);
    }
}


/**
 *  Java 泛型转换：
 *  1. 虚拟机中没有泛型，只有普通的类和方法
 *  2. 所有的类型参数都用它们的限定类型替换
 *  3. 桥方法被合成来保持多态
 *  4. 为保持类型安全性，必要时插入强制类型转换
 *
 *  约束与局限性
 *  1. 不能用基本类型实例化类型参数，没有 Pair<double>， 只有 Pair<Double>
 *  2. 运行时类型查询只适用于原始类型，语句 if(a instanceof Pair<T>)  // Error
 *  3. 不能创建参数化类型数组，语句Pair<String> table = new Pair<String>[10];  // Error
 *  4. Varargs 警告
 *  5. 不能实例化类型变量
 *  6. 不能构造泛型数组
 *  7. 泛型
 */
