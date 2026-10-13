package be.vdab.theorie.strategy.meer;

class Schaatsen implements OversteekStrategie {
    @Override
    public void inpakken() {
        IO.println("Inpakken");
    }

    @Override
    public void steekOver() {
        IO.println("Schaatsen");
    }

    @Override
    public void uitpakken() {
        IO.println("Uitpakken");
    }
}
