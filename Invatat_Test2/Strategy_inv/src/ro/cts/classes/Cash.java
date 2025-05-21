package ro.cts.classes;

public class Cash implements iPlata{
private int bancnota;

    public Cash(int bancnota) {
        this.bancnota = bancnota;
    }

    @Override
    public void alegeTipPlata(float notaPlata) {
        if(bancnota>notaPlata)
        {

            System.out.println("Ati platit cash, rest: "+(this.bancnota-notaPlata));
        }
        else System.out.println("nu aveti bani");
    }
}
