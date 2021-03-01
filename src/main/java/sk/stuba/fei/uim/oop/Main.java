package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.car.Auto;

public class Main {
    public static void main(String[] args) {
        Auto skoda = new Auto();
        Auto bmw = new Auto();

        skoda.one = 1;
        bmw.one = 2;

        if(skoda.one == bmw.one) {
            System.out.println("rovnake");
        } else {
            System.out.println("rozne");
        }
    }
}
