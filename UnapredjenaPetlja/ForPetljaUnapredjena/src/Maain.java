import java.util.Scanner;

public class Maain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] niz = {2,5,8,9,29};
		
		//stampanje elementa niza
		Scanner sc = new Scanner(System.in);
		System.out.println("Stampanje elemenata niza: ");
		for (int i = 0;i < niz.length; i++ )
		{
			System.out.println(niz[i]);
		}
		System.out.println("\nStampanje niza unapapredjenom for petljom");
		
		  
		for(int i : niz  )
			System.out.println(i);  // bolji nacin za nizoveSystem.out.println("Unesite broj: ");
	
		 
		
	
		
	}

}
