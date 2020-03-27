package com.roy.testdemo.enjoy.create.fatory.abstractFactory;


import com.roy.testdemo.enjoy.entity.Bag;
import com.roy.testdemo.enjoy.entity.Fruit;

/**
 * 抽象水果工厂
 */
public abstract class AbstractFactory {

    public abstract Fruit getFruit();

    public abstract Bag getBag();

}
