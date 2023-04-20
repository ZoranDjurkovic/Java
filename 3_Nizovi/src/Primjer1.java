import java.util.Scanner;

public class Primjer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesite broj clanovca niza n: ");
		int n = ulaz.nextInt();

		// Rezervisanje prostora za niz od n clanova
		int x[] = new int[n];

		System.out.println("Unesite clanove niza:");
		for (int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "] = ");
			x[i] = ulaz.nextInt();

		}
		// Stampanje clanova niza

		for (int i = 0; i < x.length; i++)
			System.out.print(" | " + x[i] + " | ");

		ulaz.close();
	}

}
