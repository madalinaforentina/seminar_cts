package ro.ase.cts.factorymethod;

public class Atacant extends Jucatori{

	public Atacant(String numeJucator) {
		super(numeJucator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atacant []").append(super.toString());
		return builder.toString();
	}
	

}
