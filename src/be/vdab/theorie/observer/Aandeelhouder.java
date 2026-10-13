package be.vdab.theorie.observer;

class Aandeelhouder implements Observer {
    private final String voornaam;

    Aandeelhouder(String voornaam) {
        this.voornaam = voornaam;
    }

    @Override
    public void update(Aandeel aandeel) {
        IO.println(voornaam + " koopt of verkoopt " + aandeel.getCode()
                + " met koers " + aandeel.getKoers());
    }
}
