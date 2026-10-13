package be.vdab.theorie.decorator;

class Main {
    void main() {
        var eenvoudig = new EenvoudigeKoffie();
        IO.println(eenvoudig.getKost());
        IO.println(eenvoudig.getBereiding());
        IO.println();

        var metMelk = new MetMelk(new EenvoudigeKoffie());
        IO.println(metMelk.getKost());
        IO.println(metMelk.getBereiding());
        IO.println();

        var metChocolade = new MetChocolade(new EenvoudigeKoffie());
        IO.println(metChocolade.getKost());
        IO.println(metChocolade.getBereiding());
        IO.println();

        var metMelkEnChocolade = new MetChocolade(new MetMelk(new EenvoudigeKoffie()));
        IO.println(metMelkEnChocolade.getKost());
        IO.println(metMelkEnChocolade.getBereiding());


        Koffie koffie = new EenvoudigeKoffie();
        if ("j".equals(IO.readln("Melk (j/n):"))) {
            koffie = new MetMelk(koffie);
        }
        if ("j".equals(IO.readln("Chocolade (j/n):"))) {
            koffie = new MetChocolade(koffie);
        }
        IO.println(koffie.getKost());
        IO.println(koffie.getBereiding());
    }
}
