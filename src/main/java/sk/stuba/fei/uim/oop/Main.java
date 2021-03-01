package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.car.Auto;

public class Main {
    public static void main(String[] args) {
        Auto skoda = new Auto();

        System.out.println("Dotankoval som: " + skoda.dotankovat());
        System.out.println(skoda.currentState());

        skoda.drive(100);

        System.out.println("Dotankoval som: " + skoda.dotankovat());
        System.out.println(skoda.getStavNadrze());

        skoda.drive(200);

        System.out.println(skoda.getStavNadrze());
        System.out.println(skoda.currentState());
    }
}
