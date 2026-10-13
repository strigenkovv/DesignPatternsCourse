package be.vdab.theorie.decorator.vakantiepark;

class Barbecue extends OnderdeelDecorator {
    Barbecue(Onderdeel onderdeel) {
        super(onderdeel);
    }

    @Override
    public String getTaak() {
        return onderdeel.getTaak() + ", plaats een barbecue bij de bungalow";
    }
}
