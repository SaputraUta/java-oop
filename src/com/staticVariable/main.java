package com.staticVariable;

class Display {
    static String type = "Display";
    String name;
    
    Display(String name) {
        this.name = name;
    }

    void setType (String type) {
        Display.type = type;
    }

    void show() {
        System.out.println(type + " " + name);
    }
}

public class main {
    public static void main(String[] args) {
        Display display1 = new Display("Monitor");
        display1.show();
        Display display2 = new Display("LCD");
        display2.show();

        display1.setType("Layar");

        display1.show();
        display2.show();
    }
}
