package matrice;

import java.util.Scanner;

public class dPrimjer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite Broj redova ");
		int red = sc.nextInt();

		System.out.print("Unesite Broj kolona ");
		int kolona = sc.nextInt();

		int a[][] = new int[red][kolona];

		System.out.println("Elementi matrice a");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + "," + j + "]" + " = ");
				a[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		// ispisivanje elemenata matrice
		System.out.println("Elementi matrice a su");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		int zbir = 0;
		double as = 1;
		double brojac = 0;
		for (int i = 0; i < red; i++)
			for (int j = 0; j < kolona; j++) {
				if (a[i][j] > 0) {
					zbir += a[i][j];
					brojac++;
				}
			}
		System.out.println();
		as = (double) zbir / brojac;
		System.out.print("sredina " + as);

		System.out.println();
		sc.close();

	}

}
