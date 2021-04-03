package ro.ase.cts.builder;

public class Main {
	public static void main(String args[]) {
		Rezervare r1= new Rezervare(1234,false, false,true, false,"jazz");
		Rezervare r2= new RezervareBuilder().setCodRezervare(15).setAreScaunErgonomic(true).build();
		Rezervare r3=new RezervareBuilder().setCodRezervare(25).setGenMuzica("pop").build();
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		RezervareBuilder br= new RezervareBuilder();
		Rezervare r4= br.setCodRezervare(254).setAreBauturaInclusa(true).build();
		Rezervare r5= br.setCodRezervare(213).setAreBauturaInclusa(true).build();
		System.out.println(r4);
		System.out.println(r5);
		
		RezervareBuilderV2 builderRezervareV2=new RezervareBuilderV2();
		builderRezervareV2.setAreBauturaInclusa(true).setAreMancareInclusa(true).setAreScaunErgonomic(true);
		Rezervare rezervare6=RezervareBuilderV2.setCodRezervare(4).build();
		Rezervare rezervare7=RezervareBuilderV2.setCodRezervare(10).build();
		System.out.println(rezervare6.toString());
		System.out.println(rezervare7.toString());

	}
	

}
