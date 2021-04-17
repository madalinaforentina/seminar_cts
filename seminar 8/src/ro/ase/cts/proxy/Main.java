package ro.ase.cts.proxy;
import  ro.ase.cts.proxy.OperatoriRezervari;
import  ro.ase.cts.proxy.ProxyOperatorRezervari;
public class Main {

	public static void main(String[] args) {
		OperatoriRezervari operator=new OperatoriRezervari();
		operator.realizeazaRezervare("Ana", 1);
		
		ProxyOperatorRezervari prozy=new ProxyOperatorRezervari(operator,4);
		prozy.realizeazaRezervare("ndbd", 6);
		
		
		
	}
	

}
