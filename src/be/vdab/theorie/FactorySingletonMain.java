package be.vdab.theorie;

class FactorySingletonMain {
    void main() {
        var document = DocumentFactory.INSTANCE.open("liedje.docx");
        document.printPreview();
        document.print();
    }
}
