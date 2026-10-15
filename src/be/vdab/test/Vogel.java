package be.vdab.test;

/**
 * Een vogel die op het eiland woont.
 */
public final class Vogel extends Inwoner {

    public Vogel(String naam) {
        super(naam);
    }

    /**
     * Vogels reageren hierop door hoger op te vliegen.
     */
    @Override
    public void reageerOpVulkaanuitbarsting() {
        System.out.println(getNaam() + " vliegt hoger.");
    }
}
