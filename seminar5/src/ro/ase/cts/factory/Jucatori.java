package ro.ase.cts.factory;

public class Jucatori {
	public String numeJucator;

	public Jucatori(String nume) {
		super();
		numeJucator = nume;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jucatori [Nume=");
		builder.append(numeJucator);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
