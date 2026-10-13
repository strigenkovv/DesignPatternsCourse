package be.vdab.theorie.coordinaten;

class Main {
    void main() {
        var coordinaat = new Coordinaat.CoordinaatBuilder()
                .metX(1)
                .metY(2)
                .metZ(3)
                .maakCoordinaat();
        IO.println(coordinaat);
    }
}
