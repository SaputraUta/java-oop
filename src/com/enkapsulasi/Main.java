package com.enkapsulasi;

class Lingkaran {
    private double diameter;

    Lingkaran (double diameter) {
        this.diameter = diameter;
    }

    public double getJariJari() {
        return this.diameter / 2;
    }

    public void setJarijari(double jariJari) {
        this.diameter = jariJari * 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran(5);
        System.out.println(lingkaran1.getJariJari());
        lingkaran1.setJarijari(10);
        System.out.println(lingkaran1.getJariJari());
    }
}
