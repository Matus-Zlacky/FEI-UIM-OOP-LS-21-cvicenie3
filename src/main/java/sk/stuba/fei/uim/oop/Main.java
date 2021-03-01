package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.car.Auto;

public class Main {
    public static void main(String[] args) {
        Auto skoda = new Auto();

        skoda.stavNadrze = 100;

        skoda.drive(100);

        System.out.println(skoda.stavNadrze);

        skoda.drive(200);

        System.out.println(skoda.stavNadrze);
    }
}
