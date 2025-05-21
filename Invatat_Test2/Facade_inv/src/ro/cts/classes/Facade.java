package ro.cts.classes;

public class Facade

{
public void verificare(Ghiseu g){
    Acte acte= new Acte();
    OperatorGhiseu operator = new OperatorGhiseu();

    if(g.isEsteLiber()){
        if(operator.esteOperatorulLaGhiseu(g)){
            if(acte.avetiActele(g)){
                System.out.println("Nu la mine, la colega");
            }
            else System.out.println("nu aveti toate actele");
        }
        else System.out.println("Operator absent");
    }
    else System.out.println("Ghiseu ocupat");
}

}
