package be.vdab.theorie.composite.bouwfirma;

class Main {
    void main() {
        var project = new Project();
        project.add(new Grondstofkost(10, 100));
        project.add(new Arbeidskost(35, 20));

        var subproject = new Project();
        subproject.add(new Grondstofkost(25, 40));
        subproject.add(new Arbeidskost(45, 12));

        project.add(subproject);
        IO.println(project.getPrijs());
    }
}
