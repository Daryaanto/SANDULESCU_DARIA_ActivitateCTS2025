package ro.cts.classes;

public class HP extends Produs{
    private String username;

    public HP(int durataBaterie, String culoare, String username) {
        super(durataBaterie, culoare);
        this.username = username;
    }


    @Override
    public void utilizeaza() {
        System.out.println("Working on my hp");
    }
}
