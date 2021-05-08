package ro.ase.cts.command;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
	
	List<Executa> comenzi;
	
	public ManagerComenzi() {
		comenzi=new ArrayList<Executa>();
	}
	
	public void invoca(Executa comanda) {
		comenzi.add(comanda);
	}
	public void executaComanda() throws Exception {
		if(comenzi.size()>0) {
		comenzi.get(0).executa();
		comenzi.remove(0);
	}else {
		throw new Exception();
		}
	}
	
	public void executaComenzi() {
		for(Executa e: comenzi) {
			e.executa();
		}
		comenzi.clear();
	}
	
}
