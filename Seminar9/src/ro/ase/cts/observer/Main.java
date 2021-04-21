package ro.ase.cts.observer;

public class Main {

	public static void main(String[] args) {
		Restaurant restaurant=new Restaurant("restaurant","Bucurest");
		Client client1=new Client("ans");
		Client client2=new Client("mada");
		Client client3=new Client("Ion");
		
		restaurant.adaugaObserver(client2);
		restaurant.adaugaObserver(client3);
		restaurant.realizareOfertaPret();
		restaurant.adaugaObserver(client1);
		restaurant.stergeObserver(client3);
		
		restaurant.introducereMeniu();
		
		
		

	}

}
