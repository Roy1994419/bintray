package com.roy.testdemo.enjoy.structure.proxy;


import com.roy.testdemo.enjoy.service.OrderService;
import com.roy.testdemo.enjoy.service.impl.OutOrderServiceImpl;

public class ProxyOrder implements OrderService {

    //真实的订单服务
    private OrderService orderService = new OutOrderServiceImpl();

    @Override
    public int saveOrder() {
        System.out.println("开始海外下订单");
        return orderService.saveOrder();
    }
}
