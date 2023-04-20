package zoran.djurkovic;

import zoran.djurkovi.Boje;

public class Main {
	/* Nabrajanje je lista imenovanih vrednosti koje su definisani nov tip podataka
	 * i njegove dozvoljene vrednosti. To znaci da nabrajanje moze da sadryi 
	 * samo neku od vrednosti na listi. Druge vrednosti
     *
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boje b;  //int a
		
		b = Boje.Crvena; // a = 5;
		
		System.out.println("Boja: " +  b);
		
		b = Boje.Plava;
		
		if (b == Boje.Plava) {
			
			System.out.println("Plava");
			
		}
		switch (b) {
		case Crvena:
			System.out.println("Crvena");
			break;
		case Zelena:	
			System.out.println("Zelena");
		case Plava:
			System.out.println("Plava");
			break;
		case Crna:
			System.out.println("Crna");
			break;
		case Bela:
			System.out.println("Bela");
			break;
		case Narandzasta:
			System.out.println("Narandzasta");
			break;
		case Zuta:
			System.out.println("Zuta");
			break;
		}
		

		
		//nabrajanje novi tip podataka al unapred definisanje vrednosti
	}

}
