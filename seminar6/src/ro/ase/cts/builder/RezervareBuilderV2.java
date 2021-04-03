package ro.ase.cts.builder;

public class RezervareBuilderV2 implements RezervareBuilderAbstract {
	
	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areBauturaInclusa;
	private boolean areScaunErgonomic;
	private boolean areMuzicaAmbientala;
	private String genMuzica;
	
	

	public RezervareBuilderV2() {
		super();
		this.codRezervare = 0;
		this.areMancareInclusa = false;
		this.areBauturaInclusa = false;
		this.areScaunErgonomic = false;
		this.areMuzicaAmbientala = false;
		this.genMuzica = null;
	}



	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return new Rezervare(codRezervare,areMancareInclusa,areBauturaInclusa,areScaunErgonomic,areMuzicaAmbientala,genMuzica);
	}



	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}



	public void setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
	}



	public void setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.areBauturaInclusa = areBauturaInclusa;
	}



	public void setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
	}



	public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
	}



	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}
	
	

}
