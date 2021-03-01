package sk.stuba.fei.uim.oop.car;

public class Auto {
    private static final double FUEL_PER_KM = 0.5;

    private double kapacitaNadrze;
    private double stavNadrze;
    private boolean neojazdene;

    public void drive(double distanceInKm) {
        neojazdene = false;
        stavNadrze -= distanceInKm * FUEL_PER_KM;
        if (stavNadrze < 0) {
            stavNadrze = 0;
        }
    }

    public void setStavNadrze(double stavNadrze) {
        this.stavNadrze = stavNadrze;
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
