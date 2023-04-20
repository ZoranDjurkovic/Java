import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak_2_ZDj_Test_3 {

	public static void main(String[] args) throws Exception {

		double s, s1 = 0, s2 = 0;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.##");
		double x[] = new double[100];
		System.out.println("Unesite broj elemenata N niza x");

		int n = Integer.parseInt(ulaz.readLine());

		System.out.println("unesite elemente niza ");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "]=");
			x[i] = Double.parseDouble(ulaz.readLine());

		}

		for (int i = 1; i <= n; i++) {

			s1 += x[i] * x[i];
			s2 += x[i];

		}

		s = Math.sqrt(s1 / n - Math.pow(s2 / n, 2));

		System.out.println("Standartdna devijacija je " + df.format(s));

	}

}
