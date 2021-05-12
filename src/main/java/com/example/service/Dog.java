package com.example.service;

public class Dog extends Animal {
    public Dog(){
        addWalkNum();
    }
    public void walk(){
        addWalkNum();
        System.out.println("小狗跑");
    }
}
