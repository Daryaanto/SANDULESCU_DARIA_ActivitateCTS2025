package ro.cts.classes;

public class Autobuz extends AInfoTransport{



    @Override
    public void recomandaTransport(int distanta) {
        if(distanta<5)
            System.out.println("Ia autobuzul");
        else
            super.getNext().recomandaTransport(distanta);

    }
}
