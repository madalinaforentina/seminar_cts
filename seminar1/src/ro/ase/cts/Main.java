package ro.ase.cts;

import clase.Animal;
import clase.Girafa;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo zoo=new Zoo();
		Animal z1=new Zebra("Monica");
		Animal z2=new Zebra("Gigel");
		Animal g1=new Girafa("Moni");
		Animal g2=new Girafa("Gig",500);
		
		
		zoo.adaugareAnimal(z1);
		zoo.adaugareAnimal(z2);
		zoo.adaugareAnimal(g1);
		zoo.adaugareAnimal(g2);
		
		zoo.feedAnimal();

	}

}
