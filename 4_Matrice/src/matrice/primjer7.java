package matrice;

import java.util.Scanner;

public class primjer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = 0;
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
		for (int i = 0; i < red; i++)
			for (int j = 0; j < kolona; j++) {
				c += niz[i][j];

			}
		System.out.println("Zbir elemenata matrice je " + c);
		sc.close();

	}

}
