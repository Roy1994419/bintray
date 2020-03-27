package com.roy.testdemo.enjoy.create.fatory.fatoryMethod;


import com.roy.testdemo.enjoy.entity.Fruit;
import com.roy.testdemo.enjoy.entity.fruit.Orange;

/**
 * 工厂方法模式
 */
public class OrangeFactory implements FruitFactory{
    public Fruit getFruit(){
        return new Orange("Peter",80);
    }
}
