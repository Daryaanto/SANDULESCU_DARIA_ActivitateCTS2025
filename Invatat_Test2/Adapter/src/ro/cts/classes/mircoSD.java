package ro.cts.classes;

public class mircoSD implements iMicroSD {
    private float memorie;
    private String firma;
    private String telefon;

    public mircoSD(float memorie, String firma, String telefon) {
        this.memorie = memorie;
        this.firma = firma;
        this.telefon = telefon;
    }

    @Override
    public void acceseazaMicroSD(){
        System.out.println("Card microSD de la firma: " + firma+" cu memoria de "+ memorie +"GB" );
    }
}
