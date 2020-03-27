package com.roy.testdemo.enjoy.create.fatory.abstractFactory;


import com.roy.testdemo.enjoy.entity.Bag;
import com.roy.testdemo.enjoy.entity.Fruit;
import com.roy.testdemo.enjoy.entity.bag.AppleBag;
import com.roy.testdemo.enjoy.entity.fruit.Apple;

/**
 * 水果工厂
 */
public class AppleFactory extends AbstractFactory{

    @Override
    public Fruit getFruit() {
        return new Apple();
    }

    @Override
    public Bag getBag() {
        return new AppleBag();
    }
}
