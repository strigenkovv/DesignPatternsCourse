package be.vdab.theorie;

public class Main {
    void main() {
        Motor.INSTANCE.start();
        stopDeAuto();

        Versnellingsbak.INSTANCE.schakelHoger();
        Versnellingsbak.INSTANCE.schakelHoger();

        IO.println(Versnellingsbak.INSTANCE.getVersnelling());

        Versnellingsbak.INSTANCE.schakelLager();
        IO.println(Versnellingsbak.INSTANCE.getVersnelling());

        Versnellingsbak.INSTANCE.schakelAchteruit();
        IO.println(Versnellingsbak.INSTANCE.getVersnelling());
    }

    private static void stopDeAuto() {
        Motor.INSTANCE.stop();
    }
}
