package ro.ase.cts.proxy;

public class ProxyOperatorRezervari implements IOperatoriRezervari {
	
	private OperatoriRezervari operator;
	private int nrMinPers;
	
	

	public ProxyOperatorRezervari(OperatoriRezervari operator,int nrMinPers) {
		super();
		this.operator = operator;
		 this.nrMinPers= nrMinPers;
	}



	@Override
	public void realizeazaRezervare(String nume, int nrPersoane) {
		if(nrPersoane>= nrMinPers) {
			operator.realizeazaRezervare(nume, nrPersoane);
		}else {
			System.out.println("Fara rezervare");
		}
		
	}

}
