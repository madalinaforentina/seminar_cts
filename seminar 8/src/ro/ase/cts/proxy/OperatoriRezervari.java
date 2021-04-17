package ro.ase.cts.proxy;

public class OperatoriRezervari implements IOperatoriRezervari{

	@Override
	public void realizeazaRezervare(String nume, int nrPersoane) {
		System.out.println("A fost realizata rezervarea pentru "+nrPersoane+
				" pe numele "+nume);
		
		
	}

}
