package zorandjurkovic;

import java.util.Scanner;

public class Zadatak1_Zoran_Djurkovic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite prvi broj");
		int a = sc.nextInt();
		System.out.println("Unesite drugi broj");
		int b = sc.nextInt();

		int min = a;

		if (b < min)
			min = b;

		System.out.println("Manji od unetih brojeva je  " + min);
		sc.close();

	}

}
