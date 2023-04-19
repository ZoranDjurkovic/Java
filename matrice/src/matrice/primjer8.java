package matrice;

import java.util.Scanner;

public class primjer8 {

	public static void main(String[] args) {
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
		System.out.println("Elementi dvodimenizalnog niza a su");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}
		int c = niz[0][0];
		for (int i = 0; i < red; i++)
			for (int j = 0; j < kolona; j++) {

				if (niz[i][j] > c)
					c = niz[i][j];

			}
		System.out.println("Najveci element u matrici je " + c);
		sc.close();

	}

}
