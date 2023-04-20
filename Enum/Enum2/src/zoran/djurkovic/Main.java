package zoran.djurkovic;

public class Main {

	public static void main(String[] args) {
		//Sva nabrajanje imaju dve unapred definisane metode
		// values() vraca niz koji sadrzi listu konstanti definisanih u nabranju
        // valuesOf() vraca konstantu iz nabrajanja cija vrednost odgovara
		// znakovnom nizu prosledjeneom u argument
		
		Boja b;
		
		System.out.println("Boje: ");
		
		Boja nizBoja [] = Boja.values();
		
		for(Boja c : nizBoja) {
			System.out.println(c + " ");
		}
		
		Boja c1;
		c1 = Boja.valueOf("Bela"); // ova metoda vraca vrednost iz nabrajanja koja odgovara imenu zadate konstante
		
		System.out.println("Boja: " + c1);
	}

}
