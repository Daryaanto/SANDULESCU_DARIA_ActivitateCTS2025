package ro.cts.readers;

import ro.cts.seminar2.Angajat;
import ro.cts.seminar2.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends BaseReader {
    public AngajatReader(String fileName) {
        super(fileName);
    }

    @Override


    public  List<Aplicant> readAplicant()  throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(super.getFileName()));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            //TODO
            Angajat angajat = new Angajat();
            citireAplicant(input2, angajat);
            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            //Angajat a = new Angajat(nume, prenume, varsta, punctaj, nr, vect, salariu, ocupatie);
            angajati.add(angajat);
        }
        input2.close();
        return angajati;
    }
}
