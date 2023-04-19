package zorandjurkovic;

import java.util.Scanner;

public class Zadatak12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ulaz = new Scanner(System.in);
		int a, b, c;

		System.out.println("Unesitre vrednost za a");
		a = ulaz.nextInt();
		System.out.println("Unesitee vrednost za b");
		b = ulaz.nextInt();
		System.out.println("Unesite vrednost za c");
		c = ulaz.nextInt();

		int min = a;

		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		System.out.println("Najmanji broj je " + min);
		ulaz.close();

	}

}
