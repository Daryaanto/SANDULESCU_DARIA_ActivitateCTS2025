package ro.cts.classes;

import java.util.HashMap;
import java.util.Map;

public class RegistrulCometrului {
    private String program;
    private float buget;

    private Map<String, Firma> firme=new HashMap<>();

    public RegistrulCometrului(String program, float buget ) {
        this.program = program;
        this.buget = buget;
    }

    public Firma getFirma(String nume, int cifra, String adresa, int nrAngajati){
        if(!firme.containsKey(nume)){
            Firma f = new Firma(nume,cifra,adresa,nrAngajati);
            firme.put(nume,f);
        }
        return firme.get(nume);
    }
}
