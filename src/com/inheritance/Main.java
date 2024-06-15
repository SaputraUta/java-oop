package com.inheritance;

class Animal {
    protected String name;

    Animal(String name) {
        this.name = name;
    }

    void eating(){
        System.out.println(this.name + " is eating");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void eating() {
        super.eating();
        System.out.println(this.name + " is eating dog food");
    }
    
    void bark() {
        System.out.println(this.name + " is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog coki = new Dog("Coki");
        coki.eating();
        coki.bark();
    }
}
