package com.example.service;

import org.springframework.stereotype.Component;

@Component
public class Duck extends Animal {


    public Duck(){
        addSwimNum();
        addSingNum();
    }
    public void swim() {
        System.out.println("我在游泳");
    }
    //实现鸟的sing方法
    public void sing(){
        System.out.println("嘎嘎嘎");
    }
}

