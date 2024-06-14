package com.staticMethod;

import java.util.ArrayList;

class Player {
    private static int numberOfPlayers = 0;
    private static ArrayList<String> nameList = new ArrayList<String>();

    private String name;

    Player(String name) {
        this.name = name;
        Player.numberOfPlayers++;
        Player.nameList.add(this.name);
    }

    void show() {
        System.out.println("Player name: " + this.name);
    }

    static void showNumberOfPlayers() {
        System.out.println("Number of players: " + Player.numberOfPlayers);
    }

    static ArrayList<String> getNameList() {
        return Player.nameList;
    }

}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("John");
        player1.show();
        Player player2 = new Player("Jane");
        player2.show();
        Player.showNumberOfPlayers();
        System.out.println(Player.getNameList());
    }
}
