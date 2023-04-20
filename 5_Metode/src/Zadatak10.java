import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak10 {

	// Definisanje metode
	public static double nk(double a, double b, double c, double k) {
		return Math.pow(-1, k) * (5 * a - 8 * b + 25 * c) / 13;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int m, i;
		double n0, n1, n2, n3, min, max, pro;

		DecimalFormat df = new DecimalFormat();
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos podataka
		System.out.print("Unesite broj elemenata niza: \n m = ");
		m = Integer.parseInt(ulaz.readLine());

		n0 = 1.0;
		n1 = 1.5;
		n2 = 2.0;
		min = n0;
		max = n2;
		pro = n0 * n1 * n2;

		for (i = 3; i <= m - 1; i++) {
			n3 = nk(n0, n1, n2, (double) i);
			pro *= n3;

			if (n3 < min)
				min = n3;
			if (n3 > max)
				max = n3;

			n0 = n1;
			n1 = n2;
			n2 = n3;

		}
		// Stampanje rezultata
		System.out.println("min = " + df.format(min) + ", max = " + df.format(max) + ", proizvod = " + df.format(pro));

	}

}
