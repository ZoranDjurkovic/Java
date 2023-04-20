package paket;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

   Scanner ulaz = new Scanner(System.in);	
	
	
		
	List <Integer> brojevi = new ArrayList <Integer> ();
	
		
	System.out.println("Unesite vrednosti elemenata kolekcije jednu po jednu");
	
	Integer n;
	 while((n = ulaz.nextInt()) > 0) {
	
	 brojevi.add(n); 
		  
		 System.out.println("ArrayList kolekcija " +brojevi);
	
	 }
	 
	 
	 ulaz.close();
	}
	}
	
