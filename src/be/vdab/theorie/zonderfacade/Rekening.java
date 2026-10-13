package be.vdab.theorie.zonderfacade;

import java.math.BigDecimal;

class Rekening {
    private BigDecimal saldo = BigDecimal.ZERO;

    void storten(BigDecimal bedrag) {
        saldo = saldo.add(bedrag);
    }

    BigDecimal getSaldo() {
        return saldo;
    }
}
