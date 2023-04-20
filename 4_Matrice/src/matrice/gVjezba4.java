package matrice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class gVjezba4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		double[][] a = new double[10][10];
		double[][] b = new double[10][10];
		double[][] c = new double[10][10];

		DecimalFormat df = new DecimalFormat();

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite dimenziju n matrica a i b");
		int n = Integer.parseInt(ulaz.readLine());

		// Unos elemenata matrice a
		System.out.println("Unesite elemente matrice a ");
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= n; j++) {
				System.out.print("a[" + i + "][" + j + "] = ");
				a[i][j] = Double.parseDouble(ulaz.readLine());
			}
		// Unos elemenata matrice b
		System.out.println("Unesite elemente matrice b ");
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= n; j++) {
				System.out.print("b[" + i + "][" + j + "] = ");
				b[i][j] = Double.parseDouble(ulaz.readLine());
			}
		// Trazenje matrice c
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= n; j++) {
				if (i < j)
					c[i][j] = a[i][j] * a[i][j] - b[i][j] * b[i][j];
				else if (i == j)
					c[i][j] = Math.abs(a[i][j]) + Math.abs(b[i][j]);
				else
					c[i][j] = Math.sqrt(a[i][j] * a[i][j] + b[i][j] * b[i][j]);

			}
		// Stampanje izlaznog rezultata
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= n; j++) {
				System.out.print(df.format(c[i][j]) + " ");
				System.out.println();
			}

	}

}
