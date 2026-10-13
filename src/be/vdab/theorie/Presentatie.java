package be.vdab.theorie;

class Presentatie extends Document {
    Presentatie(String bestandsnaam) {
        super(bestandsnaam);
    }

    @Override
    void print() { IO.println("afdruk van presentatie"); }

    @Override
    void printPreview() { IO.println("afdrukvoorbeeld van presentatie"); }
}
