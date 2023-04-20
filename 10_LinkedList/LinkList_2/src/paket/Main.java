package paket;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String imena [] = {"Mika", "Zika","Fica"};
		
		List<String> listaImena = new LinkedList<String>();
		for(String s : imena)
			listaImena.add(s); // niz u kolekciju
		System.out.println("Lista pre dodavanja imena " + listaImena);
		
		String imena1 []= {"Ana","Lena","Hana","Una"};
		
		List<String> listaImena1 = new LinkedList<String>();
		for(String ime : imena1)
			listaImena1.add(ime);
		
		System.out.println("Druga lista " + listaImena1);
		
		listaImena.addAll(listaImena1);
		System.out.println( "Nova lista " + listaImena);
		
		listaImena.subList(1, 2).clear();
		//indexFrom pocevsi od zadatok indeksa i ukljucujuci isti
		//indexTo do zadatog indeksa bez istog

		System.out.println("Nova lista nakon brisanja elemenata sa indeksom od 1 do  4 " + listaImena);

	}

}
