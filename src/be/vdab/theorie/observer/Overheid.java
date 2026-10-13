package be.vdab.theorie.observer;

class Overheid implements Observer {
    @Override
    public void update(Aandeel aandeel) {
        IO.println("De overheid registreert de nieuwe koers van "
                + aandeel.getCode() + ": " + aandeel.getKoers());
    }
}
