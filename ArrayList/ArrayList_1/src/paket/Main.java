package paket;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> kolekcija = new ArrayList<String>();
		
		//metode vezane za kolekciju ArrayList
		
		//size() - vraca broj elemenata u kolekcije ArrayList
		
		System.out.println("Pocetna duzina " + kolekcija.size());
		
		//add() = dodaje element na kraj kolekcije
		
		kolekcija.add("Prvi");
		kolekcija.add("Drugi");
		kolekcija.add("Treci");
		kolekcija.add("Cetvrti");
		
		//prolazak kroz kolekciju
		for(String s : kolekcija)
			System.out.printf("%s ", s);
		
		System.out.println(" Trenutna duzina " + kolekcija.size());
		
		//provera da li se neki zadati element nalazi unutar kolekcije
		// contains - vraca true ako kolekcija sadrzi trazeni element, odnosno
		// vraca false ukoliko kolekcija ne sadrzi zadati element
		
		boolean sadrzi = kolekcija.contains("Treci"); // true ili false
		
		if(sadrzi) { // sadrzi == true
			System.out.println("Trazeni element se nalazi u zadatoj kolekciji: ");
			
		}else {
			System.out.println("Trazene elemen se ne nalazi u zadatoj kolekciji");
		}
		
		// get() - vraca element sa zadatim indeksom
		
		String element = kolekcija.get(2);
		System.out.println("Element sa indeksom 2 je u kolekciji je: " + element);
		
		//indexOf  - vraca indeks prve pojave zadatog elemenata kolekcije
		//vrati ce -1 ukoliko trazeni element ne postoji
		
		int pozicija = kolekcija.indexOf("Drugi");
		System.out.println("Element Drugi je na poziciji: " + pozicija);
		
		//toArray sluzi za prebacivanje elemenata u nizu
		
		String[] nizString = new String[kolekcija.size()];
		kolekcija.toArray(nizString);  //kolekcija u niz
		//prolazak
		for(String s : nizString)
			System.out.printf("%s ", s);

		//remov()  - brise prvu poja zadate vrednosti
		kolekcija.remove("Treci");
		System.out.print("\n");
		for(String s : kolekcija)
			System.out.printf("%s ", s);
		
		//clear() = brise sve elemente iz zadate kolekcije
		
		kolekcija.clear();
		System.out.println("\n\nVelicina kolekcije nakon brisanja " + kolekcija.size())
;
		
   	}

}
