package ro.ase.cts.command;

public class ComandaDepunere implements Executa {
	private ContBancar cont;
	private float sumaDepusa;
	

	public ComandaDepunere(ContBancar cont, float sumaDepusa) {
		super();
		this.cont = cont;
		this.sumaDepusa = sumaDepusa;
	}


	@Override
	public void executa() {
		cont.depunere(sumaDepusa);
		
	}
	
	

}
