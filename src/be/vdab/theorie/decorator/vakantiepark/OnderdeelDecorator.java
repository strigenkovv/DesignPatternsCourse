package be.vdab.theorie.decorator.vakantiepark;

abstract class OnderdeelDecorator implements Onderdeel {
    protected final Onderdeel onderdeel;

    OnderdeelDecorator(Onderdeel onderdeel) {
        this.onderdeel = onderdeel;
    }
}
