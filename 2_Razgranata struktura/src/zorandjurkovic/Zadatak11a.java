package zorandjurkovic;

import java.util.Scanner;

public class Zadatak11a {

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

		int max = a;

		if (b > a) {
			max = b;
		} else {
			max = a;
		}

		if (c > a) {
			max = c;
		} else {
			max = a;
		}

		if (c > b) {
			max = c;
		} else {
			max = b;
		}

		System.out.println("Najveci broj je " + max);
		ulaz.close();
	}

}
