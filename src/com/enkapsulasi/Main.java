package com.enkapsulasi;

class Player {
    private String name;
    private int baseHealth;
    private int baseAttack;
    private Weapon weapon;
    private Armor armor;
    private int level;
    private int incrementHealth;
    private int incrementAttack;

    Player(String name) {
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
    }

    public void display() {
        System.out.println("\nPlayer name: " + this.name);
        System.out.println("Player level: " + this.level);
        System.out.println("Player attack: " + this.getAttack());
        System.out.println("Player max health: " + this.maxHealth());

    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void levelUp() {
        this.level++;
    }

    public int maxHealth() {
        return this.baseHealth + this.incrementHealth * this.level + this.armor.getAddHealth();
    }

    public int getAttack() {
        return this.baseAttack + this.level * this.incrementAttack + this.weapon.getAttack();
    }
}

class Weapon {
    private String name;
    private int damage;

    Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public int getAttack() {
        return this.damage;
    }
}

class Armor {
    private String name;
    private int strength;
    private int health;

    public Armor(String name, int strength, int health) {
        this.name = name;
        this.strength = strength;
        this.health = health;
    }

    public int getAddHealth() {
        return this.strength * 10 + this.health;
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Lil taa");
        Player player2 = new Player("Uta");
        Armor armor1 = new Armor("Helmet", 5, 100);
        Weapon weapon1 = new Weapon("Sword", 100);
        Armor armor2 = new Armor("Chestplate", 3, 100);
        Weapon weapon2 = new Weapon("Bow", 50);

        player1.setWeapon(weapon1);
        player1.setArmor(armor1);
        player2.setWeapon(weapon2);
        player2.setArmor(armor2);
        player1.display();
        player2.display();

        player1.levelUp();
        player2.levelUp();
        player1.display();
        player2.display();
        
    }
}