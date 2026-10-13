package be.vdab.theorie.strategy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Persoon {
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("d/M/yyyy");
    private final String voornaam;
    private final String familienaam;
    private final String titel;

    Persoon(String voornaam, String familienaam, String titel) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.titel = titel;
    }

    String getVoornaam() {
        return voornaam;
    }

    String getFamilienaam() {
        return familienaam;
    }

    String getTitel() {
        return titel;
    }

    String maakBriefHoofding(AansprekingAlgoritme algoritme) {
        return "Brussel, " + FORMATTER.format(LocalDate.now()) + "\n"
                + algoritme.getAanspreking(this) + "\n";
    }
}
