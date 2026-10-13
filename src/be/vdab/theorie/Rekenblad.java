package be.vdab.theorie;

class Rekenblad extends Document {
    Rekenblad(String bestandsnaam) {
        super(bestandsnaam);
    }

    @Override
    void print() { IO.println("afdruk van rekenblad"); }

    @Override
    void printPreview() { IO.println("afdrukvoorbeeld van rekenblad"); }
}
