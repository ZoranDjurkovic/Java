package zorandjurkovic;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int a, b;
		int y;

		System.out.println(" Unesite vrednost za a");
		a = input.nextInt();
		System.out.println("Unesite vrednost za b");
		b = input.nextInt();
		if (a >= 0) {
			y = Math.min(a, b);
		} else {
			y = 2 * Math.min(a, b);
		}

		System.out.println(" Y je  " + y);
		input.close();

	}

}
