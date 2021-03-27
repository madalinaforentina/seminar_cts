package ro.ase.cts.factorymethod;

public class MijlocasFactory implements Factory {

	@Override
	public Jucatori creeazaJucatori(String numeJucator) {
		// TODO Auto-generated method stub
		return new Mijlocas(numeJucator);
	}
	

}
