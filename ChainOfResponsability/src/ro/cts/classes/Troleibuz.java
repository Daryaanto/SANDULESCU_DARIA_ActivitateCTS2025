package ro.cts.classes;

public class Troleibuz extends AInfoTransport{




    @Override
    public void recomandaTransport(int distanta) {
        if(distanta<3)
            System.out.println("Ia troleibuzul");
        else
            super.getNext().recomandaTransport(distanta);
    }
}
