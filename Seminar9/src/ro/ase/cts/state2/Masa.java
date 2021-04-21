package ro.ase.cts.state2;

public class Masa {
	private State stare;
	private int cod;
	public Masa(int cod) {
		super();
		this.stare=new StareLibera();
		this.cod = cod;
	}
	public State getStare() {
		return stare;
	}
	public void setStare(State stare) {
		this.stare = stare;
	}
	public int getCod() {
		return cod;
	}
	public void rezervaMasa() {
		StareRezervata stareRezervata=new StareRezervata();
		stareRezervata.modificaStare(this);
	}
	public void ocupaMasa() {
		StareOcupata stareOcupata=new StareOcupata();
		stareOcupata.modificaStare(this);
	}
	public void elibereazaMasa() {
		StareLibera stareLibera=new StareLibera();
		stareLibera.modificaStare(this);
	}
	public void ridicaRezervare() {
		ocupaMasa();
	}
	
	

}
