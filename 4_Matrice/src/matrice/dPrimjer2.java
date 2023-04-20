package matrice;

import java.util.Scanner;

public class dPrimjer2 {

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
				System.out.print("a [" + i + "," + j + "]" + " = ");
				niz[i][j] = sc.nextInt();
			}
			System.out.println();
			sc.close();
		}

		System.out.println();
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (i % 2 != 0) // indeksi
					// if ((i + 1) % 2 == 0) {// red
					System.out.print(i + " " + j);
			}

		}

	}

}
