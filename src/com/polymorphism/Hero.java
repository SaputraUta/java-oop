package com.polymorphism;

public class Hero {
    protected String name;
    Hero(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Hero name: " + name);
    }
}
