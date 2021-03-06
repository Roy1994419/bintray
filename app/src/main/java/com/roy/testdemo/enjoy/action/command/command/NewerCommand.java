package com.roy.testdemo.enjoy.action.command.command;


import com.roy.testdemo.enjoy.action.command.Command;
import com.roy.testdemo.enjoy.action.command.handler.NewerHandler;

public class NewerCommand extends Command {
    private NewerHandler handler = new NewerHandler();

    @Override
    public String execute() {
        return handler.getNewers();
    }
}
