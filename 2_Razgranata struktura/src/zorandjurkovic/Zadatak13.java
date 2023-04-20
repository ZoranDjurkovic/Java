package zorandjurkovic;

import java.util.Scanner;

public class Zadatak13 {

	public static void main(String[] args) {

		double x, y, x1, x2, y1, y2;

		Scanner ulaz = new Scanner(System.in);

		System.out.println(" Unesite kooredinatu x tacke");
		x = ulaz.nextDouble();

		System.out.println("Unesite koorinatu y tacke");
		y = ulaz.nextDouble();

		System.out.println("Unesite koordinatu x1 tacke pravougaonika");
		x1 = ulaz.nextDouble();
		System.out.println("Unesite koordinatu x2 tacke pravougaonika");
		x2 = ulaz.nextDouble();
		System.out.println("Unesite koordinatu y1 pravougaonika");
		y1 = ulaz.nextDouble();
		System.out.println("Unesite koordinatu y2 pravougaonika");
		y2 = ulaz.nextDouble();

		if ((x > x1) && (x < x2) && (y > y1) && (y < y2)) {
			System.out.println("TAcka jhe unutar praougonika");
		} else {
			System.out.println("TAcka nije unutar pravougaonika");
		}
		ulaz.close();
	}

}
