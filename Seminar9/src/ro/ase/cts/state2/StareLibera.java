package ro.ase.cts.state2;

public  class StareLibera implements State {
	
	public void modificaStare(Masa masa) {
		if(!(masa.getStare()instanceof StareLibera)) {
			System.out.println("Masa"+masa.getCod()+"eliberata");
			masa.setStare(this);
		}else {
			System.out.println("Masa nu poate fi eliberata");
		}
	}

}
