package be.vdab.theorie.decorator.vakantiepark;

class Fietsen extends OnderdeelDecorator {
    Fietsen(Onderdeel onderdeel) {
        super(onderdeel);
    }

    @Override
    public String getTaak() {
        return onderdeel.getTaak() + ", plaats fietsen bij de bungalow";
    }
}
