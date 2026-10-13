package be.vdab.theorie.composite.bouwfirma;

class Grondstofkost implements Prijsbaar {
    private final double eenheidsprijs;
    private final double hoeveelheid;

    Grondstofkost(double eenheidsprijs, double hoeveelheid) {
        this.eenheidsprijs = eenheidsprijs;
        this.hoeveelheid = hoeveelheid;
    }

    @Override
    public double getPrijs() {
        return eenheidsprijs * hoeveelheid;
    }
}
