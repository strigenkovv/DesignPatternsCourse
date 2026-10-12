package be.vdab.theorie;

public enum Versnellingsbak {
    INSTANCE;

    private int versnelling = 0;

    void schakelHoger() {
        if (versnelling < 5) {
            versnelling++;
        }
    }

    void schakelLager() {
        if (versnelling > 0) {
            versnelling--;
        }
    }

    void schakelAchteruit() {
        versnelling = -1;
    }

    int getVersnelling() {
        return versnelling;
    }
}
