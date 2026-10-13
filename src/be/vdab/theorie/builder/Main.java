package be.vdab.theorie.builder;

class Main {
    void main() {
        var builder = new InwonerBuilder();
        var inwoner = builder.metVoornaam("Olivier")
                .metFamilienaam("Gerard")
                .metAantalKinderen(1)
                .maakInwoner();
        IO.println(inwoner);
    }
}
