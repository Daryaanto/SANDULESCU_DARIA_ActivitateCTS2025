package ro.cts.modules;

public class Client implements Observer {

    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(this.name + ", ai primit urmatorul mesaj: " + mesaj);

    }
}
