package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.Card;
import ro.ase.cts.decorator.Decorator;
import ro.ase.cts.decorator.DecoratorContactlessTelefon;

public class Main {

		public static void main(String[] args) {
			Card card1=new Card("Ion",3000);
			card1.realizareplataNormala(200);
			card1.realizareplataOnline(100);
			Decorator cardNou=new Decorator(card1);
			cardNou.platesteContactless(400);
			
			DecoratorContactlessTelefon decoratorContactlessTelefon=
					new DecoratorContactlessTelefon(card1);
			decoratorContactlessTelefon.platesteContactless(360);

	}

}
