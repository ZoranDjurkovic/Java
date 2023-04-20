package paket;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Pravi A objekat za tip Integer
		A <Integer> intObjekat = new A<Integer> (100);
		
		//String naziv;
		//int cena
		
		//Knjiga k1 = new Knjiga();
		
		intObjekat.prikaziTip();
		int vrednostObjekta = intObjekat.getOb();
		
		System.out.println("Vrednost " + vrednostObjekta);
		System.out.println("\n");
		//Pravi A objekat za tip String
		
		A<String> stringObjekat = new A<String> ("tekst");
		
		stringObjekat.prikaziTip();
		
		String str = stringObjekat.getOb();
		System.out.println("Vrednost " + str);
		

	}

} //Zakljucak= T je zamena za stvarni tip koji ce biti zadat u trenutku kreiranja objekta klase A