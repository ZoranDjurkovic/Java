package zorandjurkovic;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a;
		double y;

		System.out.println("Unesite vrednost za a ");

		a = input.nextInt();

		if (a % 2 != 0) {
			y = (double) 1 / a;
		} else {
			y = (a - 1) * (a - 1);
		}

		System.out.println(" Y je " + y);
		input.close();
	}

}
