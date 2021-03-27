package ro.ase.cts.factorymethod;

public class FactoryFundas implements Factory {

	@Override
	public Jucatori creeazaJucatori(String numeJucator) {
		// TODO Auto-generated method stub
		return  new Fundas(numeJucator);
	}
	

}
