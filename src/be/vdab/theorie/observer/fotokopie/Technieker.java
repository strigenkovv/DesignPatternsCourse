package be.vdab.theorie.observer.fotokopie;

class Technieker implements Observer {
    private final int personeelsnummer;

    Technieker(int personeelsnummer) {
        this.personeelsnummer = personeelsnummer;
    }

    @Override
    public void update(Fotokopieermachine machine) {
        IO.println("Technieker " + personeelsnummer
                + " moet onderhoud uitvoeren aan fotokopiemachine "
                + machine.getSerienummer());
    }
}
