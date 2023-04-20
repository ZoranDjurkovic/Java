package matrice;

import java.util.Scanner;

public class primjer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite Broj redova");
		int red = sc.nextInt();

		System.out.print("Unesite Broj kolona");
		int kolona = sc.nextInt();

		int a[][] = new int[red][kolona];
		int b[][] = new int[red][kolona];
		int c[][] = new int[red][kolona];

		System.out.println("Elementi matrice a");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + "," + j + "]" + " = ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elementi matrice b");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("b[" + i + "," + j + "]" + " = ");
				b[i][j] = sc.nextInt();
			}
		}

		// ispisivanje elemenata matrice
		System.out.println("Elementi dvodimenizalnog niza a su");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
		System.out.println();
		System.out.println("Elementi dvodimenizalnog niza b su");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(b[i][j] + " ");
			}
		}

		for (int i = 0; i < red; i++)
			for (int j = 0; j < kolona; j++) {
				c[i][j] = a[i][j] - b[i][j];
			}
		System.out.println();
		System.out.println("Elementi dvodimenizalnog niza tj razlika a+b = c su");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(c[i][j] + " ");
			}
		}
		System.out.println();
		sc.close();
	}

}
