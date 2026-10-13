package be.vdab.theorie.decorator.vakantiepark;

class Main {
    void main() {
        Onderdeel arrangement = new Bungalow();

        if (IO.readln("Barbecue toevoegen? (j/n) ").equalsIgnoreCase("j")) {
            arrangement = new Barbecue(arrangement);
        }
        if (IO.readln("Fietsen toevoegen? (j/n) ").equalsIgnoreCase("j")) {
            arrangement = new Fietsen(arrangement);
        }

        IO.println(arrangement.getTaak());
    }
}
