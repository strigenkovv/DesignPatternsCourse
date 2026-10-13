package be.vdab.theorie.zonderfacade;

import java.math.BigDecimal;

class Main {
    void main() {
        var persoon = new Persoon(
                new Beroepsinkomsten(BigDecimal.valueOf(3_000)),
                new Rekening());
        if (persoon.getBeroepsinkomsten().getMaandWedde()
                        .compareTo(BigDecimal.valueOf(2_500)) >= 0
                && persoon.getRekening().getSaldo().compareTo(BigDecimal.ZERO) > 0
                && persoon.getLeningen().isEmpty()) {
            IO.println("Goedgekeurd");
        } else {
            IO.println("Afgekeurd");
        }
    }
}
