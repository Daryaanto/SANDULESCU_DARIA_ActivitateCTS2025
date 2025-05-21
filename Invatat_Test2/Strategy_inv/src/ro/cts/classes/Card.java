package ro.cts.classes;

public class Card implements iPlata{

    float sold;

    public Card(float sold) {
        this.sold = sold;
    }

    @Override
    public void alegeTipPlata(float notaPlata) {
        if(this.sold >= notaPlata)
        {
            System.out.println("Ati platit cu cardul");
            this.sold=this.sold-notaPlata;
        }
        else
            System.out.println("Fonduri insuficiente");
    }
}
