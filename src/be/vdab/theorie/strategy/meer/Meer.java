package be.vdab.theorie.strategy.meer;

class Meer {
    private final OversteekStrategie strategie;

    Meer(OversteekStrategie strategie) {
        this.strategie = strategie;
    }

    void steekOver() {
        strategie.inpakken();
        strategie.steekOver();
        strategie.uitpakken();
    }
}
