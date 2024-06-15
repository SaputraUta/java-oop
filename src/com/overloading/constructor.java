package com.overloading;

class Person {
    private String name;
    private int age;

    public Person(){
        this.name = "Unknown";
        this.age = 0;
    }

    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void displayInfo() {
        System.out.println("\nName: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class constructor {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("John");
        Person person3 = new Person("Jane", 25);
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();
    }
}
