package sk.stuba.fei.uim.oop.car;

public class Auto {
    private static final double FUEL_PER_KM = 0.5;

    public double kapacitaNadrze;
    public double stavNadrze;

    public void drive(double distanceInKm) {
        stavNadrze -= distanceInKm * FUEL_PER_KM;
        if (stavNadrze < 0) {
            stavNadrze = 0;
        }
    }
}
