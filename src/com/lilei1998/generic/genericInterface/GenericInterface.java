package com.lilei1998.generic.genericInterface;

/**
 * Created by lilei on 2017/9/15 下午3:26.
 */
public class GenericInterface {
    public static void main(String[] args) {
        FruitGenerator generator = new FruitGenerator();
        System.out.println(generator.next());
        System.out.println(generator.next());
        System.out.println(generator.next());
        System.out.println(generator.next());
    }
}
