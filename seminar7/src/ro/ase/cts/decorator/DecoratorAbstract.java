package ro.ase.cts.decorator;

public abstract class DecoratorAbstract implements CardAbstract{
	private Card card;
	
	
	

	public Card getCard() {
		return card;
	}

	public DecoratorAbstract(Card card) {
		super();
		this.card = card;
	}

	@Override
	public void realizareplataOnline(int suma) {
		
		card.realizareplataOnline(suma);
		
	}

	@Override
	public void realizareplataNormala(int suma) {
		card.realizareplataNormala(suma);
	
		
	}
	
	public abstract void platesteContactless(int suma); 
	

}
