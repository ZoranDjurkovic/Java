package paket;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite cjelobrojni broj za koji ce biti izracunat faktorijel");

		IzracunavanjeFaktorijela iFa = (n) -> {
			
			
			  
		    
			int p = 1;
			
			if (n < 0)
				return -1;
			else {
				if(n == 0)
					p = 1;
				else
					for (int i = 1; i <= n; i++)
						p *= i;
			}
			
			return p;
			

		};
		System.out.println("Faktorijel unesenog broja je " + iFa.faktorijel(sc.nextInt()));
		sc.close();
	}

}
