package ro.cts.classes;

public class NotaDePlataRevelion extends PrinterFelicitare{

    public NotaDePlataRevelion(Nota nota) {
        super(nota);
    }

    @Override
    public void printareFelicitare() {
        System.out.println("an nou fericit");
    }
}
