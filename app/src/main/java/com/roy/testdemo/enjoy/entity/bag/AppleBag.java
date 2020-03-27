package com.roy.testdemo.enjoy.entity.bag;


import com.roy.testdemo.enjoy.entity.Bag;

/**
 * 苹果包装
 * Created by Peter on 10/9 009.
 */
public class AppleBag implements Bag {
    @Override
    public void pack() {
        System.out.print("--苹果使用纸箱包装");
    }
}
