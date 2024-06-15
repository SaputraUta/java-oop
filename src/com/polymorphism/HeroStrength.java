package com.polymorphism;

public class HeroStrength extends Hero {

    HeroStrength(String name) {
        super(name);
    }

    @Override
    void display() {
        System.out.println("Hero Strength name: " + name);
    }
}
