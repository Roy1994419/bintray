package com.roy.testdemo.enjoy.structure.adapter;


import com.roy.testdemo.enjoy.entity.bag.AppleBag;
import com.roy.testdemo.enjoy.entity.bag.OrangeBag;

/**
 * 桔子包装适配器
 */
public class OrangeBagAdapter extends OrangeBag {
    private AppleBag appleBag;

    public OrangeBagAdapter(AppleBag appleBag){
        this.appleBag = appleBag;
    }

    @Override
    public void pack() {
        appleBag.pack();
    }
}
