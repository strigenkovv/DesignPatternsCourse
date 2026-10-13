package be.vdab.theorie.decorator;

import java.math.BigDecimal;

class MetMelk extends KoffieDecorator {
    MetMelk(Koffie koffie) {
        super(koffie);
    }

    @Override
    public BigDecimal getKost() {
        return gedecoreerdeKoffie.getKost().add(BigDecimal.ONE);
    }

    @Override
    public String getBereiding() {
        return gedecoreerdeKoffie.getBereiding()
                + ", warm de melk, voeg de melk toe";
    }
}
