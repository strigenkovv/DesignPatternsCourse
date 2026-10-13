package be.vdab.theorie.builder;

class Inwoner {
    private final String voornaam;
    private final String familienaam;
    private final int aantalKinderen;

    Inwoner(String voornaam, String familienaam, int aantalKinderen) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.aantalKinderen = aantalKinderen;
    }

    @Override
    public String toString() {
        return voornaam + ' ' + familienaam + ' ' + aantalKinderen;
    }
}
