package com.roy.testdemo.enjoy.action.command.command;


import com.roy.testdemo.enjoy.action.command.Command;
import com.roy.testdemo.enjoy.action.command.handler.DiscountHandler;

public class DiscountCommand extends Command {

    private DiscountHandler handler = new DiscountHandler();

    @Override
    public String execute() {
        return handler.getDiscounts();
    }
}
