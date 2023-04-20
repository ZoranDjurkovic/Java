package matrice;

import java.util.Scanner;

public class dPrimjer1 {

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
		System.out.println();
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				// if(i%2=0 indeksi
				if (i % 2 != 0) { // red
					System.out.print(i + " " + j);
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
	}
}
