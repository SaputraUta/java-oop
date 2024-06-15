package com.polymorphism;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Uta");
        HeroStrength hero2 = new HeroStrength("Axe");
        hero1.display();
        hero2.display();
        Hero hero3 = new HeroIntel("Ogre");
        hero3.display();

        HeroAgility hero4 = new HeroAgility("Slark");
        hero4.display();

        Hero[] heroes = new Hero[4];
        heroes[0] = hero1;
        heroes[1] = hero2;
        heroes[2] = hero3;
        heroes[3] = hero4;
        for (Hero hero : heroes) {
            hero.display();
        }
        hero4.showOff();
    }
}
