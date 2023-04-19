package matrice;

import java.util.Scanner;

public class primjer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova");
		int red = sc.nextInt();

		System.out.print("Unesite broj kolona");
		int kolona = sc.nextInt();

		int niz[][] = new int[red][kolona];

		for (int i = 0; i < red; i++) {
			for (int j = 0; i < kolona; j++) {
				System.out.print("niz [" + i + "," + j + "]" + " = ");
				niz[i][j] = sc.nextInt();
			}
		}
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
		// svaki element ima svoju poziciju
		System.out.println();
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (niz[i][j] % 2 == 0) {
					System.out.print(niz[i][j] + " ");
				}
			}

		}
		System.out.println();
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (niz[i][j] % 2 != 0) {
					System.out.print(niz[i][j] + " ");
				}
			}
		}
		System.out.println();
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				// if(i%2==0 indeksi
				if ((i + 1) % 2 == 0) {// red
					System.out.print(i + " " + j);
				}

			}
		}
		System.out.println();
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				// if(j%2==0 indeksi
				if ((j + 1) % 2 != 0) {// kolone
					System.out.print(i + " " + j);
				}

			}

		}
		sc.close();
	}
}