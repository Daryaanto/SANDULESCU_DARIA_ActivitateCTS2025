package ro.cts.classes;

public class Adapter extends SDcard implements iMicroSD{


    public Adapter(float memorie, String firma) {
        super(memorie, firma);
    }

    @Override
    public void acceseazaMicroSD() {
        super.prezintaPoze();
    }
}
