package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class Chicken extends Animal {

    public Chicken(){
        addSingNum();
    }
    //实现sing方法
    public void sing(){
        System.out.println("咯咯");
    }
}

