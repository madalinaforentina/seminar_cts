package ro.ase.cts.command;

public class ComandaConstiutire implements Executa {
	private ContBancar cont;
	private float sumaInitiala;
	
	public ComandaConstiutire(ContBancar cont, float sumaInitiala) {
		super();
		this.cont = cont;
		this.sumaInitiala = sumaInitiala;
	}

	@Override
	public void executa() {
		cont.constituire(sumaInitiala);
		
	}

}
