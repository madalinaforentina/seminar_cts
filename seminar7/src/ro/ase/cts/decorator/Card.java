package ro.ase.cts.decorator;

public class Card implements CardAbstract {
	private String titular;
	private int sold;
	
	

	public Card(String titular, int sold) {
		super();
		this.titular = titular;
		this.sold = sold;
	}
	
	

	public void setTitular(String titular) {
		this.titular = titular;
	}



	public void setSold(int sold) {
		this.sold = sold;
	}
	
	public int getSold() {
		return sold;
	}



	@Override
	public void realizareplataOnline(int suma) {
		
		if(suma<=sold) {
			System.out.println("s-a realizat plata online."  +suma);
			sold-=suma;
		}
		
	}

	@Override
	public void realizareplataNormala(int suma) {
		if(suma<=sold) {
			System.out.println("s-a realizat plata normala"  +suma);
			sold-=suma;
		}
		
	}
	

}
