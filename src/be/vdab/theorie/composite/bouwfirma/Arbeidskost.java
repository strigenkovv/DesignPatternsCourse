package be.vdab.theorie.composite.bouwfirma;

class Arbeidskost implements Prijsbaar {
    private final double uurloon;
    private final double aantalUren;

    Arbeidskost(double uurloon, double aantalUren) {
        this.uurloon = uurloon;
        this.aantalUren = aantalUren;
    }

    @Override
    public double getPrijs() {
        return uurloon * aantalUren;
    }
}
