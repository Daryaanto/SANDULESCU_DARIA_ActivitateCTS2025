package ro.cts.classes;

public abstract class PrinterFelicitare implements Nota {
    private Nota nota;

    public PrinterFelicitare(Nota nota) {
        this.nota = nota;
    }

    @Override
    public  void printare(){
        nota.printare();
        printareFelicitare();

    }

    public  abstract void printareFelicitare();
}
