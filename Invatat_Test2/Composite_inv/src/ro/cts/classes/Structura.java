package ro.cts.classes;

public interface Structura {
    public void add(Structura s);
    public void remove(Structura s);
    public void get(int index);

    public void descriere(String indent);
}
