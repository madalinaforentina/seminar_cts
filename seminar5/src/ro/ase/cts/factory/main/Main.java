package ro.ase.cts.factory.main;

import ro.ase.cts.factory.Factory;
import ro.ase.cts.factory.Jucatori;
import ro.ase.cts.factory.TipJucator;

public class Main {

	public static void main(String[] args) {
		Factory factory=new Factory();
		Jucatori  portar= factory.getJucatori(TipJucator.Portar,"ana");
		Jucatori fundas= factory.getJucatori(TipJucator.Fundas,"Mada");
		
		System.out.println(portar.toString());
		System.out.println(fundas.toString());
	}
}
