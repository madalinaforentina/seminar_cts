package ro.ase.cts.observer;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Observabil {
	private List<Observer> observerList;
	private String nume;
	private String adresa;

	
	public Restaurant( String nume, String adresa) {
		super();
		
		this.nume = nume;
		this.adresa = adresa;
		this.observerList = new ArrayList();
	}

	@Override
	public void adaugaObserver(Observer observer) {
		this.observerList.add(observer);
		
	}

	@Override
	public void stergeObserver(Observer observer) {
		this.observerList.remove(observer);
		
	}

	@Override
	public void trimiteMesaj(String mesaj) {
		for(Observer observer:this.observerList) {
			observer.primesteMesaj("Restaurantul "+this.nume+"cu adresa"+this.adresa+"va trimite"+mesaj);
		}
		
	}
	public void realizareOfertaPret() {
		trimiteMesaj("S-a realizat o oferta");
	}
	
	public void introducereMeniu() {
		trimiteMesaj("S-a introdus un nou meniu");
	}

}
