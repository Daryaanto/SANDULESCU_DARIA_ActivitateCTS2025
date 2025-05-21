package ro.cts.modules;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public  class  MembruGrup implements Observer {

    private String nume;
    private String telefon;
    private int varsta;


    public MembruGrup(String nume, String telefon, int varsta) {
        this.nume = nume;
        this.telefon = telefon;
        this.varsta = varsta;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(nume+", ai primit acest mesaj: "+mesaj);

    }

}
