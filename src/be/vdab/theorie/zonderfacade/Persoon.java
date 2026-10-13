package be.vdab.theorie.zonderfacade;

import java.util.ArrayList;
import java.util.List;

class Persoon {
    private final Beroepsinkomsten beroepsinkomsten;
    private final Rekening rekening;
    private final List<Lening> leningen = new ArrayList<>();

    Persoon(Beroepsinkomsten beroepsinkomsten, Rekening rekening) {
        this.beroepsinkomsten = beroepsinkomsten;
        this.rekening = rekening;
    }

    void addLening(Lening lening) {
        leningen.add(lening);
    }

    Beroepsinkomsten getBeroepsinkomsten() {
        return beroepsinkomsten;
    }

    Rekening getRekening() {
        return rekening;
    }

    List<Lening> getLeningen() {
        return leningen;
    }
}
