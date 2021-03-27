package ro.ase.cts.factorymethod;

public class FactoryAtacant implements Factory {

	@Override
	public Jucatori creeazaJucatori(String numeJucator) {
		// TODO Auto-generated method stub
		return  new Atacant(numeJucator);
	}
	
	

}
