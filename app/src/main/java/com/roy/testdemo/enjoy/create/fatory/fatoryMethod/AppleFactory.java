package com.roy.testdemo.enjoy.create.fatory.fatoryMethod;


import com.roy.testdemo.enjoy.entity.Fruit;
import com.roy.testdemo.enjoy.entity.fruit.Apple;

/**
 * 工厂方法模式
 */
public class AppleFactory implements FruitFactory{
    public Fruit getFruit(){
        return new Apple();
    }
}
