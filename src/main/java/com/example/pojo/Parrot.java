package com.example.pojo;

import com.example.service.Animal;

/**
 * 封装鹦鹉
 */
public class Parrot extends Animal {
    private String partner;
    private String speak;

    public Parrot(String partner, String speak) {
        this.partner = partner;
        this.speak = speak;
    }

    public Parrot(){}

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    @Override
    public String toString() {
        return "User{" +
                "partner='" + partner + '\'' +
                ", speak='" + speak + '\'' +
                '}';
    }
    public void fly(){
        System.out.println("鹦鹉飞");
    }
}