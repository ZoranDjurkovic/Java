import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primjer9 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		double[] x = new double[100];
		double s, s1 = 0, s2 = 0;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// unos dimenzija niza

		System.out.println("Unesite broj elemenata n niza za x");
		int n = Integer.parseInt(ulaz.readLine());
		// unos elemenata niza

		System.out.println("Unesite elemente niza x: ");
		for (int i = 1; i <= n; i++) {
			System.out.print("[" + i + "] = ");
			x[i] = Double.parseDouble(ulaz.readLine());
		}

		// izracunavanje odgovarajuci suma

		for (int i = 1; i <= n; i++) {
			s1 += x[i] * x[i];
			s2 += x[i];

		}
		// izracunavanje standardne devijacije
		s = Math.sqrt(s1 / n - Math.pow(s2 / n, 2));

		System.out.println("Standartdna devijacija je " + s);

	}

}
