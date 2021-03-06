package ro.ase.cts.program;
import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.readers.ReaderAngajati;
import ro.ase.cts.readers.ReaderElevi;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {
	public static List<Aplicant>

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = ReaderAngajati.readAngajati("angajati.txt");
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}