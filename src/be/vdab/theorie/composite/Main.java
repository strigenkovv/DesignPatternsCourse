package be.vdab.theorie.composite;

class Main {
    void main() {
        var tekening = new Tekening();
        tekening.add(new Rechthoek(2, 1));
        tekening.add(new Cirkel(3));

        var subTekening = new Tekening();
        subTekening.add(new Rechthoek(3, 2));
        subTekening.add(new Cirkel(4));

        tekening.add(subTekening);
        IO.println(tekening.getOppervlakte());
    }
}
