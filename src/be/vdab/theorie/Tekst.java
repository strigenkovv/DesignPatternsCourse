package be.vdab.theorie;

class Tekst extends Document {
    Tekst(String bestandsnaam) {
        super(bestandsnaam);
    }
    @Override
    void print() { IO.println("afdruk van tekst"); }
    @Override
    void printPreview() { IO.println("afdrukvoorbeeld van tekst"); }
}
