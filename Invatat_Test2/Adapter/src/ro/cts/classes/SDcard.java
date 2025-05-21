package ro.cts.classes;

public class SDcard {

    private float memorie;
    private String firma;

    public SDcard(float memorie, String firma) {
        this.memorie = memorie;
        this.firma = firma;
    }

    public float getMemorie() {
        return memorie;
    }

    public String getFirma() {
        return firma;
    }

    public void detaliiCard(){
        System.out.println("Card SD de la firma "+firma+" cu memorie de "+memorie+" GB");
    }

    public void prezintaPoze(){
        System.out.println("Pe card aveti poze");
        detaliiCard();
    }
}
