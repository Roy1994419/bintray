package com.roy.testdemo.enjoy.create.fatory.abstractFactory;


import com.roy.testdemo.enjoy.entity.Bag;
import com.roy.testdemo.enjoy.entity.Fruit;
import com.roy.testdemo.enjoy.entity.bag.OrangeBag;
import com.roy.testdemo.enjoy.entity.fruit.Orange;

/**
 * 水果工厂
 */
public class OrangeFactory extends AbstractFactory{

    @Override
    public Fruit getFruit() {
        return new Orange("Peter",50);
    }

    @Override
    public Bag getBag() {
        return new OrangeBag();
    }
}
