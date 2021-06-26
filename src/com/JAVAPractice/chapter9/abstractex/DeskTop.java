package com.JAVAPractice.chapter9.abstractex;

public abstract class DeskTop extends Computer {

    public void disPlay(){
        System.out.println("DeskTop display()");
    }

    @Override
    public void typing(){
        System.out.println("Desktop typing()");

    }

}
