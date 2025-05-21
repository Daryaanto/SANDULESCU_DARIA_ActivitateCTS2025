package ro.cts.classes;

public class Parlamentar implements Structura{

    public String name;


    public Parlamentar(String name) {
        this.name = name;
    }

    @Override
    public void add(Structura s) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remove(Structura s) {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public void get(int i) {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public void descriere(String i) {
        System.out.println(i+ "Nume: "+this.name);
    }
}
