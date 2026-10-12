package be.vdab.theorie;

import java.util.Random;

enum Magic8Ball {
    INSTANCE;

    private final String[] antwoorden = {
            "Zoals ik het zie, ja.",
            "Het is zeker.",
            "Hoogst waarschijnlijk.",
            "Ziet er goed uit.",
            "Zonder twijfel.",
            "Ja.",
            "Zeker.",
            "Je mag er op rekenen.",
            "Vraag dit later nog eens.",
            "Dit wil je niet weten.",
            "Ik kan dit nu niet voorspellen.",
            "Concentreer je en stel je vraag opnieuw.",
            "Je moet er niet op rekenen.",
            "Nee.",
            "Ziet er niet goed uit.",
            "Zeer twijfelachtig."
    };

    private final Random random = new Random();
    private int vorigAntwoord = -1;

    String geefAntwoord() {
        int index;

        do {
            index = random.nextInt(antwoorden.length);
        } while (index == vorigAntwoord);

        vorigAntwoord = index;

        return antwoorden[index];
    }
}
