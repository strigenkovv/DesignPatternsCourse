package be.vdab.theorie.observer.fotokopie;

import java.util.ArrayList;
import java.util.List;

class Fotokopieermachine {
    private final String serienummer;
    private final int aantalKopiesVoorOnderhoud;
    private final List<Observer> observers = new ArrayList<>();
    private int aantalKopies;
    private int volgendeTechnieker;

    Fotokopieermachine(String serienummer, int aantalKopiesVoorOnderhoud) {
        this.serienummer = serienummer;
        this.aantalKopiesVoorOnderhoud = aantalKopiesVoorOnderhoud;
    }

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    void kopieMaken() {
        aantalKopies++;
        if (aantalKopies % aantalKopiesVoorOnderhoud == 0) {
            if (!observers.isEmpty()) {
                observers.get(volgendeTechnieker).update(this);
                volgendeTechnieker = (volgendeTechnieker + 1) % observers.size();
            }
        }
    }

    String getSerienummer() {
        return serienummer;
    }

    int getAantalKopies() {
        return aantalKopies;
    }
}
