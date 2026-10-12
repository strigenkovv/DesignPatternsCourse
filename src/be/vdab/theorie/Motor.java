package be.vdab.theorie;

public enum Motor {
    INSTANCE;

    private boolean gestart;

    void start() {
        gestart = true;
        IO.println("gestart");
    }

    void stop() {
        if (gestart) {
            gestart = false;
            IO.println("gestopt");
        }
    }
}
