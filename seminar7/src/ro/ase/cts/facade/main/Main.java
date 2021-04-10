package ro.ase.cts.facade.main;

import ro.ase.cts.facade.BirouDeCredit;
import ro.ase.cts.facade.Persoana;
import ro.ase.cts.facade.Politie;
import ro.ase.cts.facade.VerificatorPersoana;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persoana persoana=new Persoana("Geogreel","1990542551561");
		if(persoana.getVarsta()>=18) {
			
			if(!Politie.esteUrmarit(persoana)) {
				BirouDeCredit birou=new BirouDeCredit();
				if(!birou.areCredite(persoana)) {
					System.out.println("S a creat contul");
				}
			}
		}
		
		Persoana persoana2=new Persoana("Geogreel","1990542551411");
		if(VerificatorPersoana.verificaPersoana(persoana2)) {
			System.out.println("cont creat");
		}
		else {
			System.out.println("cont necreat");
		}
	}
}
