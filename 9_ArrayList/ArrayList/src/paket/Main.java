package paket;


import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//deklaracija ArrayList
		
		//interfejs <T> ime = new ArrayList<T>();
		//T predstavlja tip promenjive
		
		List<Integer> kolekcijaAL = new ArrayList<Integer>();
		
		// metoda add  za dodavanje
		
		kolekcijaAL.add(5);
		kolekcijaAL.add(4);
		kolekcijaAL.add(9);
		kolekcijaAL.add(7);
		kolekcijaAL.add(12);
		
		System.out.println(kolekcijaAL);
		
		//Koristite ArrayList kada ne znate unaprijed velicinu niza

	}

}
