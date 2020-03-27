package com.roy.testdemo.enjoy.create.fatory.fatoryMethod;


import com.roy.testdemo.enjoy.entity.Bag;
import com.roy.testdemo.enjoy.entity.bag.AppleBag;

/**
 * 工厂方法模式
 */
public class AppleBagFactory implements BagFactory{
    public Bag getBag(){
        return new AppleBag();
    }
}
