package zorandjurkovic;

import java.util.Scanner;

public class Zadatak5_Zoran_Djurkovic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite prvi broj");
		int a = sc.nextInt();
		System.out.println("Unesite drugi broj");
		int b = sc.nextInt();
		System.out.println("Unesite treci broj");
		int c = sc.nextInt();

		int max = a;

		if (b > max)
			max = b;

		if (c > max)
			max = c;

		System.out.println("Najveci broj je " + max);
		sc.close();
	}

}
