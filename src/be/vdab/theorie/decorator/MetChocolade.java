package be.vdab.theorie.decorator;

import java.math.BigDecimal;

class MetChocolade extends KoffieDecorator {
    MetChocolade(Koffie koffie) {
        super(koffie);
    }

    @Override
    public BigDecimal getKost() {
        return gedecoreerdeKoffie.getKost().add(BigDecimal.valueOf(2));
    }

    @Override
    public String getBereiding() {
        return gedecoreerdeKoffie.getBereiding()
                + ", schilfer de chocolade, voeg de schilfers toe";
    }
}
