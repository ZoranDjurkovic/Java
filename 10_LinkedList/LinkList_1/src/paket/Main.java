package paket;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> ll = new LinkedList<String>();
		
		//dodavanje elemenata u povezanoj listi 
		
		ll.add("A"); //0
		ll.add("B"); // 1
		
		ll.add(2, "C"); //2
		
		
		System.out.println("Elementi povezanbe liste su " + ll);
		
		//Brisanje elementa iz povezane lise
		
		ll.remove(0);  // brisanje preko indexa
		ll.remove("B"); // brisanje preko vrednosti
		
		System.out.println("Povezana lista nakon brisanja elemenata " + ll);
		
		
		ll.add("D");
		ll.add("E");
		ll.add("F");
		
		System.out.println("Povezana lista nakon brisanja elemenata i dodavanja novih " + ll);
		
		
		//Trazennje elemenata u povezanoj listi
		
		boolean sadrzi = ll.contains("E");
		
		if(sadrzi) {
			System.out.println("Lista sadrzi element E");
			
		}else
		{
			System.out.println("Lista ne sadrzi element E");
		}
		
		//pristupanje (uzimanje) vrednosti  elementa iz povezane liste
		
		Object element = ll.get(3);  //A
		System.out.println("Zatrazen element je: " + element);
		
		//postavljanje vrednosti elemenata u povezanoj listi
		
		ll.set(1, "Z");
		System.out.println("Povezana lista nakon promene: " + ll);
	}

}
