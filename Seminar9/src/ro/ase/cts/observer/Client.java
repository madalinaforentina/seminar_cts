package ro.ase.cts.observer;

public class Client implements Observer{
	private String nume;

	
	public Client(String nume) {
		super();
		this.nume = nume;
	}


	@Override
	public void primesteMesaj(String mesaj) {
		System.out.println("Clientul"+this.nume+"a primir un mesaj");
		
	}

}
