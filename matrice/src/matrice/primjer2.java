package matrice;

import java.util.Scanner;

public class primjer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Broj redova");
		int red = sc.nextInt();

		System.out.print("Broj kolona");
		int kolona = sc.nextInt();

		int niz[][] = new int[red][kolona];

		System.out.println("Elementi matrice");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + "," + j + "]" + " = ");
				niz[i][j] = sc.nextInt();
			}
		}

		// ispisivanje elemenata matrice
		System.out.println("Elementi dvodimenizalnog niza su");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(" | " + niz[i][j] + " | ");
			}
			System.out.println();
			sc.close();
		}
		System.out.println("Elementi prvog reda su");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (i == 0)
					System.out.print(niz[i][j]);
			}
		}

		System.out.println("Elementi prve kolone su");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (j == 1)
					System.out.print(niz[i][j]);
			}
		}

	}
}
