package ro.ase.cts.prototype;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client1=new Client("Marcel",17);
		Client client2=(Client) client1.copiaza();
		System.out.println(client1);
		System.out.println(client2);
		
		Bilet b1=new Bilet(23,"aaa","bbb","12.00");
		Bilet b2=(Bilet)b1.copiaza();
		b2.setCod(26);
		System.out.println(b1);
		System.out.println(b2);
		

	}

}
