package zorandjurkovic;

import java.util.Scanner;

public class Zadatak8a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);

		int a, b, z;

		System.out.println(" Unessite vrednost za ");
		a = ulaz.nextInt();

		System.out.println("Unesite za vrednost b");
		b = ulaz.nextInt();

		z = (a % 2 == 0 && b % 3 == 0) ? a + b : a - b;

		System.out.println("z = " + z);
		ulaz.close();

	}

}
