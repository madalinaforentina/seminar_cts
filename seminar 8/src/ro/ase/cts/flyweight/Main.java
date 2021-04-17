package ro.ase.cts.flyweight;
import ro.ase.cts.flyweight.FlyweightFactory;
public class Main {

	public static void main(String[] args) {
		Rezervare rezervare1=new Rezervare(1,2,"14");
		Rezervare rezervare2=new Rezervare(2,2,"14");
		Rezervare rezervare3=new Rezervare(3,5,"12");
		
		FlyweightFactory flyweightFactory=new FlyweightFactory();
		Client client1=flyweightFactory.getClient("0426545");
		client1.printeazaRezervare(rezervare1);
		flyweightFactory.getClient("0426545").printeazaRezervare(rezervare3);
		

	}

}
