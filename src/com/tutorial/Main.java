package com.tutorial;

class Player {
    String name;
    double health;
    Weapon weapon;
    Armor armor;
    Player(String name, double health) {
        this.name = name;
        this.health = health;
    }

    void attack (Player opponent) {
        double damage = this.weapon.damage;
        System.out.println("\n" + this.name + " attacking " + opponent.name + " with damage " + damage);
        opponent.defence(damage);
    }

    void defence (double damage) {
        double damageDeal;
        if (this.armor.defense < damage) {
            damageDeal = damage - this.armor.defense;
        } else { 
            damageDeal = 0;
        }
        System.out.println(damageDeal + " damage dealed to " + this.name);
        this.health = this.health - damageDeal;
        System.out.println(this.name + " health now is: " + this.health);
    }

    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void equipArmor(Armor armor) {
        this.armor = armor;
    }

    void display() {
        System.out.println("\nPlayer name: " + name);
        System.out.println("Player health: " + health);
        this.weapon.display();
        this.armor.display();
    }
}

class Weapon {
    String name;
    double damage;
    Weapon(String name, double damage) {
        this.name = name;
        this.damage = damage;
    }

    void display() {
        System.out.println("Weapon name: " + name);
        System.out.println("Damage: " + damage);
    }
}

class Armor {
    String name;
    double defense;
    Armor(String name, double defense) {
        this.name = name;
        this.defense = defense;
    }

    void display() {
        System.out.println("Armor name: " + name);
        System.out.println("Defense: " + defense);
    }
}

public class Main {
    public static void main(String[] args) {
        Player saputra = new Player("Saputra", 100);

        Weapon sword = new Weapon("Sword", 10);
        Armor helmet = new Armor("Helmet", 5);
        
        Weapon bow = new Weapon("Bow", 8);
        Armor chestplate = new Armor("Chestplate", 5);

        saputra.equipWeapon(sword);
        saputra.equipArmor(helmet);
        saputra.display();
        Player devi = new Player("Devi", 80);
        devi.equipWeapon(bow);
        devi.equipArmor(chestplate);
        devi.display();

        saputra.attack(devi);
    }
}