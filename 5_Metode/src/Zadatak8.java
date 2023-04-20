import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak8 {
	// Definisanje metode y
	static double y(int n, double x, double[] a) {
		double s = 0;
		for (int i = 1; i <= n; i++) {
			double p = 1;
			for (int j = 1; j <= n; j++)
				if (i != j)
					p *= x - a[j];

		}
		return s;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		double[] a = new double[100];
		double x;

		DecimalFormat df = new DecimalFormat("#.###");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos dimenzija niza
		System.out.println("Unesite dimenziju n niza za a ");
		int n = Integer.parseInt(ulaz.readLine());

		// Unos elemenata niza
		System.out.println("Unesite elemente niza a ");
		for (int i = 1; i <= n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = Double.parseDouble(ulaz.readLine());
		}
		// Stampanje rezultata
		System.out.println("\tN = " + n + "\tX\tY");
		for (x = 0.0; x <= 1; x += 0.1)
			System.out.println("\t\t" + df.format(x) + "\t\t" + df.format(y(n, x, a)));

	}

}
