package ro.cts.classes;

public class Tramvai extends AInfoTransport{


    @Override
    public void recomandaTransport(int distanta) {
        if(distanta<=10)
            System.out.println("Ia tramvaiul");
        else
            super.getNext().recomandaTransport(distanta);
    }
}
