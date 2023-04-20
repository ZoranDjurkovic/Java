package zoran.djurkovic;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ulaz = new Scanner(System.in);
		
		ArrayList <String>nizImena = new ArrayList<> ();
		
		System.out.println("Unesite deset imena ");
		for(int i=1; i <=10; i++) {
			
			nizImena.add(ulaz.next());
			
		}
		ulaz.close();
		System.out.println("Ispis liste imena > " + nizImena + " 2< ");
		
		nizImena.set(4, "Zoran");
		
		 System.out.println("Novi ispis niza imena sa promjenom pod rednim brojem 5" + nizImena);
		 
		 nizImena.remove(2);
		 
		 System.out.println("Brisanje elementa niza ne trecem mjestu" + nizImena);
	}

}
