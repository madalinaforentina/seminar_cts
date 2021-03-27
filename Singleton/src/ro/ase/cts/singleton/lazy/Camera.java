package ro.ase.cts.singleton.lazy;

public class Camera {
	
	private int numarCamera;
	private String tipCamera;
	private Boolean vedereLaMare;
	
	private static Camera  instante= null;
	
	private Camera(int numarCamera, String tipCamera, Boolean vedereLaMare) {
		super();
		this.numarCamera = numarCamera;
		this.tipCamera = tipCamera;
		this.vedereLaMare = vedereLaMare;
	}
	public void setNumarCamera(int numarCamera) {
		this.numarCamera = numarCamera;
	}
	public void setTipCamera(String tipCamera) {
		this.tipCamera = tipCamera;
	}
	public void setVedereLaMare(Boolean vedereLaMare) {
		this.vedereLaMare = vedereLaMare;
	}
	
	public static synchronized Camera getInstante(int numarCamera, String tipCamera, Boolean vedereLaMare) {
		if(instante==null) {
			instante=new Camera(numarCamera,tipCamera,vedereLaMare);
		}
		return instante;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Camera [numarCamera=");
		builder.append(numarCamera);
		builder.append(", tipCamera=");
		builder.append(tipCamera);
		builder.append(", vedereLaMare=");
		builder.append(vedereLaMare);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
