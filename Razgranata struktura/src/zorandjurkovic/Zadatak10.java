package zorandjurkovic;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ulaz = new Scanner(System.in);

		int a, b;

		System.out.println("Unesitre vrednost za a");
		a = ulaz.nextInt();
		System.out.println("Unesitee vrednost za b");
		b = ulaz.nextInt();

		if (b != 0) {
			System.out.println("a/b " + a / b);
		} else {
			System.out.println("Delenje nulom");
		}
		ulaz.close();
	}

}
