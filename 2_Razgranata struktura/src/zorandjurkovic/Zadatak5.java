package zorandjurkovic;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);

		double a, b;
		double y;

		System.out.println(" Unesite vrednost za a ");

		a = ulaz.nextDouble();

		System.out.println(" Unesite vrednoist za b ");

		b = ulaz.nextDouble();

		if (a >= 0) {

			y = (1 - Math.min(a, b)) / (1 + Math.max(a, b));
		} else {
			y = Math.min(a, b) / (Math.min(a * a, b * b) + 3);

		}
		System.out.println(" y je " + y);

		ulaz.close();
	}
}