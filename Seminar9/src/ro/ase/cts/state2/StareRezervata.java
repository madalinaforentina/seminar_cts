package ro.ase.cts.state2;

public class StareRezervata implements State {
	@Override
	public void modificaStare(Masa masa) {
		if(!(masa.getStare() instanceof StareLibera)) {
			System.out.println("Masa cu numarul "+masa.getCod()+" a fost rezervata.");
		}
		else {
			System.out.println("Masa nu poate fi rezervata");
		}
		
	}

}
