package ro.ase.cts.factorymethod;

public class FactoryPortar implements Factory {

	@Override
	public Jucatori creeazaJucatori(String numeJucator) {
		// TODO Auto-generated method stub
		return  new Portar(numeJucator);
	}
	

}
