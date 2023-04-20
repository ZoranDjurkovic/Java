package matrice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class gVjezba2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int[][] a = new int[20][20];
		int[][] b = new int[20][20];
		int[][] c = new int[20][20];

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos dimenzija matrica
		System.out.println("Unesite dimenzije matrica m, k i n");
		System.out.print("m = ");
		int m = Integer.parseInt(ulaz.readLine());
		System.out.print("n = ");
		int n = Integer.parseInt(ulaz.readLine());
		System.out.print("k = ");
		int k = Integer.parseInt(ulaz.readLine());

		// unos matrcica a
		System.out.println("Unesite vrednosti matrice a");
		for (int i = 1; i <= m; i++)
			for (int j = 1; j <= n; j++) {
				System.out.print("a[" + i + "][" + j + "] = ");
				a[i][j] = Integer.parseInt(ulaz.readLine());
			}
		// unos matrcica b
		System.out.println("Unesite vrednosti matrice b");
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= k; j++) {
				System.out.print("b[" + i + "][" + j + "] = ");
				b[i][j] = Integer.parseInt(ulaz.readLine());
			}

		// Nalazenje proizvoda dvije matrice

		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= n; j++) {
				c[i][j] = 0;
				for (int t = 1; t <= n; t++)
					c[i][j] += a[i][t] * b[t][j];
			}
		// Stampanje izlaznog rezultata
		System.out.println("Matrica c=a*b je ");
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= k; j++)
				System.out.print(c[i][j] + " ");
			System.out.println();
		}

	}

}
