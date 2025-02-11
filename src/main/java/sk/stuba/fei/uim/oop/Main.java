package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.car.Auto;

public class Main {
    public static void main(String[] args) {
        Auto skoda = new Auto(80);
        Auto bmw = new Auto();

        System.out.println("Skoda ------------");
        testAuto(skoda);

        System.out.println("BMW ------------");
        testAuto(bmw);

        Student student = new Student("Mato", "Pecka");
        student.setId(5178209);
        student.setVek(21);
        System.out.println(student.getMeno() + " " + student.getPriezvisko() +" "+ student.getId() +" "+ student.getVek());

    }

    public static void testAuto(Auto auto) {
        System.out.println("Dotankoval som: " + auto.dotankovat());
        System.out.println(auto.currentState());

        auto.drive(100);

        System.out.println("Dotankoval som: " + auto.dotankovat());
        System.out.println(auto.getStavNadrze());

        auto.drive(200);

        System.out.println(auto.getStavNadrze());
        System.out.println(auto.currentState());
    }
}
