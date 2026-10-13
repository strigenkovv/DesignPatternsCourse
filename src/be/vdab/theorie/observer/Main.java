package be.vdab.theorie.observer;

import java.math.BigDecimal;

class Main {
    void main() {
        var aandeel = new Aandeel("ORCL");
        var larry = new Aandeelhouder("Larry");
        var james = new Aandeelhouder("James");
        aandeel.addObserver(larry);
        aandeel.addObserver(james);
        aandeel.addObserver(new Overheid());
        aandeel.setKoers(BigDecimal.valueOf(39));
        IO.println();
        aandeel.removeObserver(james);
        aandeel.setKoers(BigDecimal.valueOf(40));
    }
}
