package zoran.djurkovic;
//nabrajanje je vrsta klase
//instance klase ne pravi se pomocu kljucne reci new
//rezervisana rec enum definise klasu
//Svaka konstata u nabrajnju je zapraVO objekat ciji je tip to isto nabrajanje
public class Main {
	public static void main(String[] args) {
		
		Boja b;
		
		System.out.println("Udeo zelene boje " + Boja.Zelena.getUdeo());
		
	System.out.println("Sve boje: ");
	
	for(Boja c : Boja.values()){
	
	
	     System.out.println(c + " " + c.getUdeo());
	}
	}
}
