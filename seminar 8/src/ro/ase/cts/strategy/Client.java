package ro.ase.cts.strategy;

public class Client {
	private String nume;
	private ModPlata modplata;
	public Client(String nume, ModPlata modplata) {
		super();
		this.nume = nume;
		this.modplata = modplata;
	}
	
	public void setModPLata(ModPlata modPlata) {
		this.modplata = modplata;
	}
	
	public void platesteNota(int Suma) {
		
	}
}
