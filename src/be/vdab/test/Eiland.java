package be.vdab.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Vertegenwoordigt het enige eiland in de applicatie.
 * Zorg ervoor dat er maar één eiland kan zijn.
 */
public enum Eiland {
    INSTANCE;

    private final List<Inwoner> inwoners = new ArrayList<>();

    /**
     * Voegt een inwoner toe aan het eiland.
     *
     * @param inwoner de inwoner die op het eiland gaat wonen
     */
    public void voegInwonerToe(Inwoner inwoner) {
        inwoners.add(inwoner);
    }

    /**
     * Laat iedere inwoner reageren op een vulkaanuitbarsting.
     */
    public void vulkaanuitbarsting() {
        System.out.println("Vulkaanuitbarsting!");
        inwoners.forEach(InwonerObserver::reageerOpVulkaanuitbarsting);
    }

}
