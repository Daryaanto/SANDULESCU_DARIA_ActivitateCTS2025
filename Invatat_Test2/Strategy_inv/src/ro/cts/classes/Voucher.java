package ro.cts.classes;

public class Voucher implements iPlata{


    private int nrVouchere;
    private int valoare;


    public Voucher(int nrVouchere, int valoare) {
        this.nrVouchere = nrVouchere;
        this.valoare = valoare;
    }

    @Override
    public void alegeTipPlata(float notaPlata) {
        if((nrVouchere*valoare)>notaPlata){
            System.out.println("Ati platit cu vouchere");
            this.nrVouchere= (int)notaPlata/valoare;
            System.out.println("Mai aveti " + this.nrVouchere + " vouchere");
        }
        else{
            System.out.println("vouchere insuficiente");
        }

    }
}
