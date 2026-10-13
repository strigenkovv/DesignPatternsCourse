package be.vdab.kerst;

abstract class Cadeau {
    private final double prijs;

    Cadeau(double prijs) {
        this.prijs = prijs;
    }

    double getPrijs() {
        return prijs;
    }
}
