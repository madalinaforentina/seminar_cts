package ro.ase.cts.chain;

public class ContCurent extends Cont {

	public ContCurent(float sold, String iban) {
		super(sold, iban);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		if(super.getSold()>=suma) {
			super.setSold(super.getSold()-suma);
			System.out.println("s a realizat plataa");
		}else {
			if(super.getNext()!=null) {
				super.getNext().plateste(suma);
			}
			else {
				System.out.println("Plata nu se poate realiza");
			}
		}
		
	}

}
