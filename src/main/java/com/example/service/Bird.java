package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class Bird extends Animal {
    //实现鸟的sing方法
    public void sing(){
        System.out.println("bird叫");
    }
    public void fly() {
        System.out.println("I am flying");
    }
}

