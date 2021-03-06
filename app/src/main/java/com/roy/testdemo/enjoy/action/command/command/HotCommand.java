package com.roy.testdemo.enjoy.action.command.command;


import com.roy.testdemo.enjoy.action.command.Command;
import com.roy.testdemo.enjoy.action.command.handler.HotHandler;

public class HotCommand extends Command {
    private HotHandler handler = new HotHandler();

    @Override
    public String execute() {
        return handler.getHots();
    }
}
