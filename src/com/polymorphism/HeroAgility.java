package com.polymorphism;

public class HeroAgility extends Hero {
    HeroAgility(String name) {
        super(name);
    }

    @Override
    void display() {
        System.out.println("Hero Agility name: " + name);
    }

    void showOff(){
        System.err.println("I'm the fastest");
    }
}
 