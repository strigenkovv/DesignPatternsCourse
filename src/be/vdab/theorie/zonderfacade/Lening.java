package be.vdab.theorie.zonderfacade;

import java.math.BigDecimal;

class Lening {
    private final BigDecimal bedrag;

    Lening(BigDecimal bedrag) {
        this.bedrag = bedrag;
    }

    BigDecimal getBedrag() {
        return bedrag;
    }
}
