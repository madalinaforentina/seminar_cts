package ro.ase.cts.command;

public class ContBancar {
	private String iban;
	private float sold;
	public ContBancar(String iban, float sold) {
		super();
		this.iban = iban;
		this.sold = sold;
	}
	
	public void constituire(float sumaInitiala) {
		this.sold=sumaInitiala;
		System.out.println("s a constituit contul cu suma"+sold);
	}
	
	public void retragere(float suma) {
		if(sold>suma) {
			this.sold-=suma;
			System.out.println("s-au retrat"+sold);
		}else {
			System.out.println("fond insufliecint");
		}
	}
	
	public void depunere(float sumaNoua) {
        sumaNoua+=sold;
		System.out.println("s-au depus"+sumaNoua);
		
	}
	

}
