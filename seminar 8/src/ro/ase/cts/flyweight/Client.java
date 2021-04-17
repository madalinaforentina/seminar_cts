package ro.ase.cts.flyweight;

public class Client implements FlyweightAbstract {
	private String nume;
	private String nrTelefon;
	private String email;
	
	
	

	public Client(String nume, String nrTelefon, String email) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.email = email;
	}




	@Override
	public void printeazaRezervare(Rezervare rezervare) {
		System.out.println("Clientul   "+this.toString()+
				" a reazliatt o rezervare " + rezervare.toString());
		
	}

}
