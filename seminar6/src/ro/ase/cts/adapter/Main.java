package ro.ase.cts.adapter;

public class Main {
	public static void rezervaSiVinde(Bilet bilet) {
		bilet.rezerva();
		bilet.vinde();
	}
	
	public static void rezervaSiVindePlatforma(BiletOnline biletOnline) {
		biletOnline.rezervaBiletOnline();
		biletOnline.vindeBiletOnline();
	}
	public static void main(String[] args) {
		Bilet bilet= new Bilet(20);
		rezervaSiVinde(bilet);
		
		BiletAdapter biletAdapter= new BiletAdapter(30);
		rezervaSiVindePlatforma(biletAdapter);
		
		BiletOnline biletOnline= new AdapterObiecteBilet(bilet);
		rezervaSiVindePlatforma(biletOnline);
		 
	}

}
