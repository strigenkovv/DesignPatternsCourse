package be.vdab.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Start de applicatie en stelt het eiland voor.
 */
public final class Main {
    /**
     * Laadt de inwoners uit een tekstbestand en start een vulkaanuitbarsting.
     *
     * @param args optioneel pad naar het tekstbestand
     * @throws Exception als het tekstbestand niet kan worden gelezen
     */
    public static void main(String[] args) throws Exception {
        Path bestand = Path.of(args.length == 0 ? "inwoners.txt" : args[0]);

        Eiland eiland = Eiland.INSTANCE;

        laadInwoners(bestand, eiland);
        eiland.vulkaanuitbarsting();
    }

    /**
     * Leest de inwoners uit het tekstbestand en voegt ze toe aan het eiland.
     *
     * @param bestand het tekstbestand met één regel per inwoner
     * @param eiland het eiland waarop de inwoners wonen
     * @throws IOException als het tekstbestand niet kan worden gelezen
     */
    private static void laadInwoners(Path bestand, Eiland eiland) throws IOException {
        for (String regel : Files.readAllLines(bestand)) {
            Inwoner inwoner = InwonerFactory.maak(regel);
            eiland.voegInwonerToe(inwoner);
        }
    }
}
