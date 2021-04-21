package ro.ase.cts.state;

public class Masa {
	private int cod;
	private State stare;
	
	public Masa(int cod) {
		super();
		this.cod = cod;
		this.stare = new StateLibera();
	}
	public void rezervaMasa() {
		if(this.stare  instanceof StateLibera) {
			System.out.println("Masa cu codul"+cod+"este rezervata");
			this.stare=new StateRezervata();
			
		}else {
			System.out.println("nu poate fi rezervata");
		}
		
	}
	public void ocupaFaraRezervare() {
		if(this.stare instanceof StateLibera) {
			System.out.println("Masa nr"+cod+"a fost ocupata");
			this.stare=new StateOcupata();
		}
		else {
			System.out.println("Masa nu poate fi ocupata");
		}
		
	}
	public void ridicaRezervarea() {
		if(this.stare instanceof StateRezervata) {
			System.out.println("Masa cu cod"+cod+"este ocupata");
			
		}else {
			System.out.println("MASA NU POATE FI OCUPATA");
		}
	}
	
	public void elibereazaMasa() {
		if(this.stare instanceof StateOcupata) {
			System.out.println("Masa cu codul"+cod+"este eliberata");
			this.stare=new StateLibera();
		}else {
			System.out.println("Masa este deja libera");
		}
	}
	
	
	

}
