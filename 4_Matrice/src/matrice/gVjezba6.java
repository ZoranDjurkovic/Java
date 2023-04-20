package matrice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class gVjezba6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int[][] a = new int[10][10];

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos dimenzije matrice

		System.out.println("Unesite dimenziju n matrice a ");
		int n = Integer.parseInt(ulaz.readLine());

		// generisanje matrice a
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= n; j++) {
				if (i == j || i + j == n + 1)
					a[i][j] = 1;
				else
					a[i][j] = 0;

			}
		System.out.println("Dobijena matrica a je");
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= n; j++) {
				System.out.print(a[i][j] + " ");
				System.out.println();

			}

	}

}
