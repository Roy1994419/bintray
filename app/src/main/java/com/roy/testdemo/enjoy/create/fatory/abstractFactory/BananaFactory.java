package com.roy.testdemo.enjoy.create.fatory.abstractFactory;


import com.roy.testdemo.enjoy.entity.Bag;
import com.roy.testdemo.enjoy.entity.Fruit;
import com.roy.testdemo.enjoy.entity.bag.BananaBag;
import com.roy.testdemo.enjoy.entity.fruit.Banana;

/**
 * 水果工厂
 */
public class BananaFactory extends AbstractFactory{

    @Override
    public Fruit getFruit() {
        return new Banana();
    }

    @Override
    public Bag getBag() {
        return new BananaBag();
    }
}
