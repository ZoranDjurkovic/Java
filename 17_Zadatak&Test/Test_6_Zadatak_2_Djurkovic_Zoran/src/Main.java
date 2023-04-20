import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		
		Kanta k = new Kanta();
		
		System.out.println("Uneste dubinu kante ");
		
		 k.setVisina(ulaz.nextDouble());
		 
		 System.out.println("Uneste poluprecnik kante");
		 
         k.setPoluprecnik(ulaz.nextDouble());
         
         System.out.println("Uneste popunjenost kante u %  ");
 		
		k.setPopunjenostKante(ulaz.nextDouble());
		
		System.out.println("Zapremina kante je " +k.Zapremina());
		
		System.out.println("Popunjenost kante u litrima iznosi " + k.popunjenostKante());
		
		
		ulaz.close();
	}

}
