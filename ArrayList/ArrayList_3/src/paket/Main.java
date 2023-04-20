package paket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imena[] = {"Mika", "Zika", "Ana", "Lana", "Hana", "Una" };

		List<String> listImena = new ArrayList <String>();
		
		for(String ime : imena )
			listImena.add(ime);   //iz niza u kolekciju
		
		String imenaZaBrisanje [] = {"Mika", "Lana", "Hana"};
		
		List<String> listaImenaZaBrisanje = new ArrayList<String>();
		
		for(String  ime : imenaZaBrisanje)
			listaImenaZaBrisanje.add(ime);
		
		
		//Kreiranje iteratora kolekcije i stampanje liste pomocu iteratora
		
		Iterator< String> iter = listImena.iterator();
		System.out.println("Stampanja elemenata pomocu iteratora");
		while(iter.hasNext())
			System.out.print(iter.next()+ " ");
		
		//Brisanje elemenata Liste imena koja se nalaza uj liste u lsti koja se zove listaZaBrisanje
		
		iter = listImena.iterator();
		while(iter.hasNext())
			if(listaImenaZaBrisanje.contains(iter.next()));
		 // imena za brisanje sadrzi element na kojuukazuju iterator
		// ako je odgovor true brisemo element
				iter.remove();
		
				
		System.out.println("\nLista nakon brisanja: ");
		for(int i =0; i < listImena.size(); i ++)
			System.out.print(listImena.get(i) + " ");
		
		}

}
