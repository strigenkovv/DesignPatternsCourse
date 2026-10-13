package be.vdab.theorie.stereoketen;

class Main {
    void main() {
        var stereoketen = new Stereoketen();
        stereoketen.start();
        stereoketen.startRadio();
        stereoketen.startCdSpeler();
        stereoketen.stop();
    }
}
