package com.roy.testdemo.enjoy.entity.bag;


import com.roy.testdemo.enjoy.entity.Bag;

/**
 * 桔子包装
 * Created by Peter on 10/9 009.
 */
public class OrangeBag implements Bag {
    @Override
    public void pack() {
        System.out.print("--桔子使用网兜包装");
    }
}
