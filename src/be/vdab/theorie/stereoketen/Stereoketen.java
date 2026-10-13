package be.vdab.theorie.stereoketen;

class Stereoketen {
    private final Versterker versterker = new Versterker();
    private final Equalizer equalizer = new Equalizer();
    private final Radio radio = new Radio();
    private final CdSpeler cdSpeler = new CdSpeler();
    private Apparaat actiefApparaat;

    void start() {
        versterker.start();
        equalizer.start();
    }

    void startRadio() {
        if (actiefApparaat == Apparaat.CD_SPELER) {
            cdSpeler.stop();
        }
        radio.start();
        actiefApparaat = Apparaat.RADIO;
    }

    void startCdSpeler() {
        if (actiefApparaat == Apparaat.RADIO) {
            radio.stop();
        }
        cdSpeler.start();
        actiefApparaat = Apparaat.CD_SPELER;
    }

    void stop() {
        versterker.stop();
        equalizer.stop();
        if (actiefApparaat == Apparaat.RADIO) {
            radio.stop();
        } else if (actiefApparaat == Apparaat.CD_SPELER) {
            cdSpeler.stop();
        }
        actiefApparaat = null;
    }

    private enum Apparaat {
        RADIO, CD_SPELER
    }
}
