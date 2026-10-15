package be.vdab.test;

/**
 * Een zoogdier dat op het eiland woont.
 */
public final class Zoogdier extends Inwoner {

    public Zoogdier(String naam) {
        super(naam);
    }

    /**
     * Zoogdieren reageren door in hun hol te schuilen.
     */
    @Override
    public void reageerOpVulkaanuitbarsting() {
        System.out.println(getNaam() + " schuilt in zijn hol.");
    }
}
