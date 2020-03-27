package com.roy.testdemo.enjoy.entity;


import com.roy.testdemo.enjoy.action.visit.Visit;

/**
 * 水果接口
 */
public interface Fruit {

    int price();

    void draw();

    int accept(Visit visit);

}
