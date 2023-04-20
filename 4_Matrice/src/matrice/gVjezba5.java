package matrice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class gVjezba5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		double[][] a = new double[10][10];
		// double[][] b = new double[10][10];
		// double[][] c = new double[10][10];

		DecimalFormat df = new DecimalFormat();

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos dimenzije matrice
		System.out.println("Unesite dimenziju n matrice a ");
		int n = Integer.parseInt(ulaz.readLine());

		// Unos elemenata matrice a
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= n; j++) {
				System.out.print("a[" + i + "][" + j + "] = ");
				a[i][j] = Double.parseDouble(ulaz.readLine());

			}
		// Trazenje odgovarajucih suma
		// s - suma svih elemenata matrica
		// sn - suma negativnih elemenata matrice

		double s = 0, sn = 0;

		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= n; j++) {
				s += a[i][j];

				if (a[i][j] < 0)
					sn += a[i][j];

			}

		// Stampanje izlaznog rezultata

		System.out.println("Suma svih elemenata a je " + df.format(s));
		System.out.println("Suma negativnih elemenata matrice a je " + df.format(sn));

	}

}
