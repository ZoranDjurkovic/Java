package zorandjurkovic;

import java.util.Scanner;

public class Zadatak2_Zoran_Djurkovic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite postanski broj");
		int pBroj = sc.nextInt();

		switch (pBroj) {
		case (11000):
			System.out.println("Beograd");
			break;
		case (21000):
			System.out.println("Novi Sad");
			break;
		case (18000):
			System.out.println("Nis");
			break;
		case (34000):
			System.out.println("Kragujevac");
			break;

		}
		sc.close();
	}
}