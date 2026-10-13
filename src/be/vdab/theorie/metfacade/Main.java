package be.vdab.theorie.metfacade;

import java.math.BigDecimal;

class Main {
    void main() {
        var persoon = new Persoon(
                new Beroepsinkomsten(BigDecimal.valueOf(3_000)),
                new Rekening());
        var verstrekker = new LeningVerstrekker();
        if (verstrekker.isLeningGoedgekeurd(persoon)) {
            IO.println("Goedgekeurd");
        } else {
            IO.println("Afgekeurd");
        }
    }
}
