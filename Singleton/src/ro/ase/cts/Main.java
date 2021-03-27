package ro.ase.cts;

import ro.ase.cts.singleton.lazy.Camera;

public class Main {
	public static void main(String[] args) {
	//ReceptieHotel receptie1=ReceptieHotel.getInstanta();
	///ReceptieHotel receptie2=ReceptieHotel.getInstanta();
	
	
	//System.out.println(receptie1.toString());
	//System.out.println(receptie2.toString());
	//receptie1.setNumeReceptioner("Andrei");
	//receptie2.setEtaj(7);
	Camera camera1=Camera.getInstante(12, "DOUBLE", false);
	camera1.setNumarCamera(37);
	Camera camera2=Camera.getInstante(27, "Single", true);
	camera2.setTipCamera("Double");
	System.out.println(camera1.toString());
	System.out.println(camera2.toString());
	
	
	
	}
}
