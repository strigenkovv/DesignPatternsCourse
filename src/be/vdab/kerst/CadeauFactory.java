package be.vdab.kerst;

class CadeauFactory {
    Cadeau maakCadeau(int leeftijd) {
        return switch (leeftijd) {
            case 0, 1, 2, 3, 4, 5 -> new Pop(20.0);
            case 6, 7, 8, 9, 10, 11, 12 -> new Gezelschapsspel(30.0);
            default -> new Boekenbon(25.0);
        };
    }
}
