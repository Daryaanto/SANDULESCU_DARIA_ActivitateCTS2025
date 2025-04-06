package ro.cts.classes;

public class Factory {
    private String nivel;
    private String tip;
    private static Factory instance=null;

    private Factory(String nivel, String tip) {
        this.nivel = nivel;
        this.tip = tip;
    }
    public synchronized static Factory getInstance(String nivel, String tip) {
        if(instance==null){
            instance=new Factory(nivel,tip);
        }
        return instance;
    }

    public IFelPrincipal getProdus(Feluri fel, int cantitate, float pret, String restaurant, boolean garnitura) {
        switch (fel){
            case Peste-> {return new Peste(cantitate,pret,restaurant,garnitura,nivel,tip);}
            case Friptura -> { return new Friptura(cantitate,pret,restaurant,garnitura,nivel,tip);}
            default -> { return null; }
        }
    }
}
