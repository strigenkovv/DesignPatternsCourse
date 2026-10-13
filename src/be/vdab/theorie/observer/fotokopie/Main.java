package be.vdab.theorie.observer.fotokopie;

class Main {
    void main() {
        var machine = new Fotokopieermachine("FC-123", 3);
        machine.addObserver(new Technieker(1001));
        machine.addObserver(new Technieker(1002));

        machine.kopieMaken();
        machine.kopieMaken();
        machine.kopieMaken();
        machine.kopieMaken();
        machine.kopieMaken();
        machine.kopieMaken();
    }
}
