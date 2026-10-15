package be.vdab.test;

/**
 * Maakt inwoners aan op basis van het soort inwoner.
 * Het eerste teken van de regel geeft het soort inwoner aan:
 * V = vogel, Z = zoogdier.
 * Iedere inwoner heeft een naam.
 */
public final class InwonerFactory {
    private InwonerFactory() {
    }

     /**
     * Maakt een inwoner op basis van een regel uit het tekstbestand.
     *
     * @param regel een regel met het type en de naam van de inwoner
     * @return een vogel of een zoogdier
     */
    public static Inwoner maak(String regel) {
        char typeInwoner = regel.charAt(0);
        String naam = regel.substring(2);

        return switch (Character.toUpperCase(typeInwoner)) {
            case 'V' -> new Vogel(naam);
            case 'Z' -> new Zoogdier(naam);
            default -> throw new IllegalArgumentException("Onbekend inwonertype: " + typeInwoner);
        };
    }
}
