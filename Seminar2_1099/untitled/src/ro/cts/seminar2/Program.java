package ro.cts.seminar2;

import ro.cts.readers.AngajatReader;
import ro.cts.readers.BaseReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		BaseReader baseReader= new AngajatReader("angajati.txt");
		try {
			listaAplicanti = baseReader.readAplicant();
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
