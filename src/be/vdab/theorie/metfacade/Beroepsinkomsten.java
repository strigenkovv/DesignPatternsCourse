package be.vdab.theorie.metfacade;

import java.math.BigDecimal;

class Beroepsinkomsten {
    private final BigDecimal maandWedde;

    Beroepsinkomsten(BigDecimal maandWedde) {
        this.maandWedde = maandWedde;
    }

    BigDecimal getMaandWedde() {
        return maandWedde;
    }
}
