package sk.stuba.fei.uim.oop.car;

public class Auto {
    private static final double FUEL_PER_KM = 0.5;

    private double kapacitaNadrze;
    private double stavNadrze;

    public void drive(double distanceInKm) {
        stavNadrze -= distanceInKm * FUEL_PER_KM;
        if (stavNadrze < 0) {
            stavNadrze = 0;
        }
    }

    public double getStavNadrze() {
        return stavNadrze;
    }

    public void setStavNadrze(double stavNadrze) {
        this.stavNadrze = stavNadrze;
    }
}
