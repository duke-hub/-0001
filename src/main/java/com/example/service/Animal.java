package com.example.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Animal {
    public static int walkNum = 0;
    public static int singNum = 0;
    public static int flyNum = 0;
    public static int swimNum = 0;


    public void addWalkNum() {
        walkNum++;
    }

    public void addSingNum() {
        singNum++;
    }

    public void addFlyNum() {
        flyNum++;
    }

    public void addSwimNum() {
        swimNum++;
    }

    public void walk() {

        System.out.println("I am walking");
    }

    public void sing() {

        System.out.println("唱歌");
    }

    public void swim() {
        swimNum++;
        System.out.println("游泳");
    }

    public void fly() {

        flyNum++;
        System.out.println("飞");
    }

    public void features() {
        System.out.println("特征");
    }
}
