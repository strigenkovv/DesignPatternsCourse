package be.vdab.theorie.builder;

class InwonerBuilder {
    private String voornaam;
    private String familienaam;
    private int aantalKinderen;

    InwonerBuilder metVoornaam(String voornaam) {
        this.voornaam = voornaam;
        return this;
    }

    InwonerBuilder metFamilienaam(String familienaam) {
        this.familienaam = familienaam;
        return this;
    }

    InwonerBuilder metAantalKinderen(int aantalKinderen) {
        this.aantalKinderen = aantalKinderen;
        return this;
    }

    Inwoner maakInwoner() {
        return new Inwoner(voornaam, familienaam, aantalKinderen);
    }
}
