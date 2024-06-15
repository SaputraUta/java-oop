package com.polymorphism;

public class HeroIntel extends Hero {

    HeroIntel(String name) {
        super(name);
    }

    @Override
    void display() {
        System.out.println("Hero Intel name: " + name);
    }
}
