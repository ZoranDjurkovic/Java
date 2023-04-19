package matrice;

import java.util.Scanner;

public class dPrimjer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				as = (double) zbir / kolona;
			}
		System.out.println();

		System.out.print("sredina " + as);

		System.out.println();
		sc.close();

	}

}