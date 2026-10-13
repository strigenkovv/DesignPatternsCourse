package be.vdab.theorie.buildernested;

class Main {
    void main() {
        var builder = new Inwoner.InwonerBuilder();
        var inwoner = builder.metVoornaam("Olivier")
                .metFamilienaam("Gerard")
                .metAantalKinderen(1)
                .maakInwoner();
        IO.println(inwoner);
    }
}
