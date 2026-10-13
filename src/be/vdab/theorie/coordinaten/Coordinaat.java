package be.vdab.theorie.coordinaten;

class Coordinaat {
    private final double x;
    private final double y;
    private final double z;

    private Coordinaat(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    static class CoordinaatBuilder {
        private double x;
        private double y;
        private double z;

        CoordinaatBuilder metX(double x) {
            this.x = x;
            return this;
        }

        CoordinaatBuilder metY(double y) {
            this.y = y;
            return this;
        }

        CoordinaatBuilder metZ(double z) {
            this.z = z;
            return this;
        }

        Coordinaat maakCoordinaat() {
            return new Coordinaat(x, y, z);
        }
    }
}
