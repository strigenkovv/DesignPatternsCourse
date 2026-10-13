package be.vdab.theorie.composite.bouwfirma;

import java.util.ArrayList;
import java.util.List;

class Project implements Prijsbaar {
    private final List<Prijsbaar> onderdelen = new ArrayList<>();

    void add(Prijsbaar onderdeel) {
        onderdelen.add(onderdeel);
    }

    @Override
    public double getPrijs() {
        return onderdelen.stream()
                .mapToDouble(Prijsbaar::getPrijs)
                .sum();
    }
}
