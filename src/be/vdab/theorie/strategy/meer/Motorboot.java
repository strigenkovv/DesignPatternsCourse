package be.vdab.theorie.strategy.meer;

class Motorboot implements OversteekStrategie {
    @Override
    public void inpakken() {
        IO.println("Inpakken");
    }

    @Override
    public void steekOver() {
        IO.println("Motorboot");
    }

    @Override
    public void uitpakken() {
        IO.println("Uitpakken");
    }
}
