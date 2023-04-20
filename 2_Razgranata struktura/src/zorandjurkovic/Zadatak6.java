package zorandjurkovic;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ulaz = new Scanner(System.in);

		double a, y;

		System.out.println(" Unesite vrednost za a");

		a = ulaz.nextDouble();

		y = (a > 0) ? Math.sqrt(a) : a * a;

		System.out.println(" Y = " + y);
		ulaz.close();
	}

}
