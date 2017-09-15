package com.lilei1998.generic.genericInterface;

import java.util.Random;

/**
 * Created by lilei on 2017/9/15 下午3:25.
 */
public class FruitGenerator implements Generator<String> {
    private String[] fruits = new String[]{"Apple", "Banana", "Pear"};

    @Override
    public String next() {
        Random rand = new Random();
        return fruits[rand.nextInt(3)];
    }
}
