package zorandjurkovic;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);
		double a, b, z;

		System.out.println("Unesite vrednost za a");
		a = ulaz.nextDouble();

		System.out.println("Unesite vrednost za b");
		b = ulaz.nextDouble();

		z = (a > b) ? 2 * a + b : a - 2 * b;

		System.out.println(" z = " + z);
		ulaz.close();

	}

}
