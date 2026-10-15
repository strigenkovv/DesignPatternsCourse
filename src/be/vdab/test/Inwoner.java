package be.vdab.test;

/**
 * Een inwoner van het eiland.
 * Iedere inwoner heeft een naam.
 */
public abstract class Inwoner implements InwonerObserver {
    private final String naam;

    /**
     * Maakt een inwoner met een naam.
     *
     * @param naam de naam van de inwoner
     */
    protected Inwoner(String naam) {
        this.naam = naam;
    }

    /**
     * Geeft de naam van de inwoner terug.
     *
     * @return de naam van de inwoner
     */
    public String getNaam() {
        return naam;
    }
}
