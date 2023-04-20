package matrice;

import java.util.Scanner;

public class primjer11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ucitavanje podataka
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj redova");
		int red = sc.nextInt();

		System.out.println("Unesite broj kolona");
		int kolona = sc.nextInt();

		// matrica = naziv naseg dvodimenzialnog niza

		int[][] matrica = new int[red][kolona];

		System.out.println("Unesite elemente: ");
		for (int i = 0; i < red; i++)
			for (int j = 0; j < kolona; j++) {
				System.out.print("matrica [" + i + "][" + j + "] = ");
				matrica[i][j] = sc.nextInt();

			}
		System.out.println();
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
		System.out.println();
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(matrica[j][i] + " ");

			}
			System.out.println();
		}

		System.out.println();
		for (int j = 0; j < kolona; j++) {
			for (int i = 0; i < kolona; i++) {
				System.out.print(matrica[i][j] + " ");

			}
			System.out.println();
		}

	}
}