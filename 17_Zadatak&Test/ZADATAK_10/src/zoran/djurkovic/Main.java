package zoran.djurkovic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite broj elemenata niza neka je 10 elemennata ");
		int n = ulaz.nextInt();
		
		int niz [] = new int [n];
		
		System.out.println(" Unesite elemente niza ");
		
		for(int i = 0; i < n; i++) {
			System.out.print("["+i+"] = ");
			niz[i] = ulaz.nextInt();
		}
		
		System.out.println("\nUnesite trazeni broj za provjeru: ");
		int trazeniBroj = ulaz.nextInt();
		
		int p = 0;
		
		for(int i=0;i <niz.length;i++) {
			
			if(niz[i] == trazeniBroj) {
				p = p + 1;
			}
		}
		
		System.out.println("Trazeni broj se "+ p + " puta  ponavlja u nizu " );
		ulaz.close();
		
		

	}

}
