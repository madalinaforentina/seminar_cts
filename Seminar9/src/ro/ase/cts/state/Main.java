package ro.ase.cts.state;

public class Main {

	public static void main(String[] args) {
		Masa masa= new Masa(100);
		masa.elibereazaMasa();
		masa.rezervaMasa();
		masa.ridicaRezervarea();
		masa.elibereazaMasa();

	}

}
