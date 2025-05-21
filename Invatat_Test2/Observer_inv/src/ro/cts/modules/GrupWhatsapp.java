package ro.cts.modules;

public class GrupWhatsapp extends Grup{
    public GrupWhatsapp(String name) {
        super(name);
    }

    @Override
    public void intraNotificare(){
        super.sendMesaj("Membru nou in grup");
    }

}
