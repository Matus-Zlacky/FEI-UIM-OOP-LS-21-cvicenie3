package sk.stuba.fei.uim.oop.car;

public class Auto {
    private static final double FUEL_PER_KM = 0.2;
    private static final double DEFAULT_CAPACITY = 100;

    private double kapacitaNadrze;
    private double stavNadrze;
    private boolean neojazdene;

    public Auto(double kapacitaNadrze) {
        this.neojazdene = true;
        this.kapacitaNadrze = kapacitaNadrze;
    }


    public Auto() {
        this(DEFAULT_CAPACITY);
    }

    public void drive(double distanceInKm) {
        neojazdene = false;
        stavNadrze -= distanceInKm * FUEL_PER_KM;
        if (stavNadrze < 0) {
            stavNadrze = 0;
        }
    }

    public double dotankovat() {
        double diff = kapacitaNadrze - stavNadrze;
        stavNadrze = kapacitaNadrze;
        return diff;
    }

    public double getStavNadrze() {
        return stavNadrze;
    }

    public String currentState() {
        String result;
        if (this.neojazdene) {
            result = "Auto je neojazdene.";
        } else {
            result = "Auto je ojazdene.";
        }
        result += "\n"+stavNadrze+"/"+kapacitaNadrze;
        return result;
    }
}
