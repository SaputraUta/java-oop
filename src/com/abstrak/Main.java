package com.abstrak;

abstract class Hero {
    private String name;
    Hero(String name) {
        this.name = name;
    }

    abstract void display();

    String getName() {
        return name;
    }
}

class HeroIntel extends Hero {
    HeroIntel(String name) {
        super(name);
    }

    void display() {
        System.out.println("Hero Intel name: " + this.getName());
    }
}

class HeroStr extends Hero {
    HeroStr(String name) {
        super(name);
    }

    void display() {
        System.out.println("Hero Strength name: " + this.getName());
    }
}

public class Main {
    public static void main(String[] args) {
        HeroStr hero1 = new HeroStr("Uta");
        hero1.display();
        HeroIntel hero2 = new HeroIntel("Axe");
        hero2.display();
    }
}
