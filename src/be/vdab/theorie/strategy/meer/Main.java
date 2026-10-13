package be.vdab.theorie.strategy.meer;

class Main {
    void main() {
        var temperatuur = -2;
        var windkracht = 0;
        var strategie = kiesStrategie(temperatuur, windkracht);
        new Meer(strategie).steekOver();
    }

    private static OversteekStrategie kiesStrategie(int temperatuur, int windkracht) {
        if (temperatuur <= 0) {
            return new Schaatsen();
        }
        if (windkracht > 0) {
            return new Zeilen();
        }
        return new Motorboot();
    }
}
