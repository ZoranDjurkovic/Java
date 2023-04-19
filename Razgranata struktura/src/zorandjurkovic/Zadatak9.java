package zorandjurkovic;

import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);

		int a, b, z;

		System.out.println("Unesitre vrednost za a");
		a = ulaz.nextInt();
		System.out.println("Unesitee vrednost za b");
		b = ulaz.nextInt();

		if ((a % 2 != 0) && (b % 2 == 0)) {
			z = a + b;
		} else {
			z = a * b;
		}

		System.out.println("Z je " + z);
		ulaz.close();
	}

}
