package ro.cts.classes;

import java.util.ArrayList;
import java.util.List;

public class GrupParlamentar implements Structura {
    private String nume;
    private List<Structura> listaMembrii;

    public GrupParlamentar(String nume) {
        this.nume = nume;
        this.listaMembrii = new ArrayList<Structura>();
    }

    @Override
    public void add(Structura s) {
        listaMembrii.add(s);
    }

    @Override
    public void remove(Structura s) {
listaMembrii.remove(s);
    }

    @Override
    public void get(int index) {
listaMembrii.get(index);
    }

    @Override
    public void descriere(String indent) {
        System.out.println("Partidul: " + nume);
        for (Structura s : listaMembrii) {
            s.descriere(indent+"    ");
        }
    }
}
