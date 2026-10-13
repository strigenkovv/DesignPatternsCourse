package be.vdab.theorie.strategy.meer;

class Zeilen implements OversteekStrategie {
    @Override
    public void inpakken() {
        IO.println("Inpakken");
    }

    @Override
    public void steekOver() {
        IO.println("Zeilen");
    }

    @Override
    public void uitpakken() {
        IO.println("Uitpakken");
    }
}
