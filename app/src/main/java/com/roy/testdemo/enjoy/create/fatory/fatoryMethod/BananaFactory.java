package com.roy.testdemo.enjoy.create.fatory.fatoryMethod;


import com.roy.testdemo.enjoy.entity.Fruit;
import com.roy.testdemo.enjoy.entity.fruit.Banana;

/**
 * 工厂方法模式
 */
public class BananaFactory implements FruitFactory{
    public Fruit getFruit(){
        return new Banana();
    }
}
