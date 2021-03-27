package ro.ase.cts.factory;

public class Factory {

	
	public Jucatori getJucatori(TipJucator tipJucator, String numeJucator) {
		switch (tipJucator) {
		case Portar: {
			return new Portar(numeJucator);
		}
		case Fundas: {
			return new Fundas(numeJucator);
		}
		case Atacant: {
			return new Atacant(numeJucator);
		}
		default: {
			throw new IllegalArgumentException();
		}
	}
	}
}
