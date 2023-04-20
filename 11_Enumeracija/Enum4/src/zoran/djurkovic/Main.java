package zoran.djurkovic;

public class Main {

	public static void main(String[] args) {
		
		
		//ordinal() - dobija se redni broj tj polozaj date konstante na listi na listi konstanti u nabrajanjn, redni brojevi pocinju od nule
		
		
		System.out.println("Boja - redni broj");
		
		for(Boja c : Boja.values()) {
			System.out.println( c + " " + c.ordinal());
		}

		//compareTo() - poredi redne brojeve dveju konstanti iz istog nabrajanja
		//Ako je redni broj pozivajuce konstante manji od rednog broja konstante metoda compareto vraca negativan broj
		
		//Ukoliko su redni brojevi jednaki, metoda compareTo vraca nulu
		
		//Ako pozivajuca konstanta ima redni broj ima veci od rednog broja konstante metoda vraca ozitivan broj
		
		Boja b1, b2, b3;
		b1 = Boja.Crvena;
		b2 = Boja.Zelena;
		b3 = Boja.Plava;
		
		if(b1.compareTo(b2)<0) {
			System.out.println(b1+ " " + " dolazi pre " + b2);
			}
		if (b1.compareTo(b2) > 0) {
			System.out.println(b2+ " " + " dolazi pre " + b1);
		}
		if (b1.compareTo(b2) == 0) {
			System.out.println(b1+ " " + " jednako " + b2);
		}
		
		//equals() - poredi se jednakost konstante iz nabrajanja sa svakim
		// drugim objektom
		
		if(b1.equals(b2))
			System.out.println("Greska");
		
		if(b1.equals(b3))
			System.out.println(b1 + "jednako" + b3);
		
		if(b1 == b3)
			System.out.println(b1 + " ==" + b3);
	}

}
