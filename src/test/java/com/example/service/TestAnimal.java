package com.example.service;

import com.example.pojo.Parrot;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class TestAnimal {


    @Test
    void testOne() {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }

    @Test
    void testTwo() {
        Duck duck = new Duck();
        duck.sing();
        duck.swim();
        Chicken chicken = new Chicken();
        chicken.sing();
        chicken.fly();
    }
    @Test
    void testThr(){
        //4.鹦鹉
        Parrot p = new Parrot("狗生活", "汪汪");
        Parrot p2 = new Parrot("猫生活", "喵喵");
        Parrot p3 = new Parrot("公鸡生活", "叽叽");
        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);
    }
    @Test
    void testFou(){
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dog(),
                new Butterfly(),
        };
       Map<String,Integer>  map = findCount();

    }

    private Map<String,Integer> findCount() {
        Map<String,Integer>  map = new HashMap<>();

        map.put("动物中有多少能飞 ",Animal.flyNum);
        map.put("动物中有多少能走路 ",Animal.walkNum);
        map.put("动物中有多少会唱歌 ",Animal.singNum);
        map.put("动物中有多少会游泳 ",Animal.swimNum);

        return map;
    }
}