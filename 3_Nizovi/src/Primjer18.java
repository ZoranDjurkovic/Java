import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primjer18 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		double s = 0, s1 = 0, p = 1;

		// Kreiranje cjelobrojnog niza

		double x[] = new double[100];

		// Unos vrednosti promenjive n

		System.out.println("Unesite broj elemenata n niza x");
		int n = Integer.parseInt(ulaz.readLine());

		// Unos elemenata niza x

		System.out.println("Unesite elemente niza x: ");
		for (int i = 1; i <= n; i++) {
			System.out.println("[" + i + "] = ");
			x[i] = Double.parseDouble(ulaz.readLine());
		}

		for (int i = 1; i <= n; i++) {
			s += x[i] * x[i];
			s1 += x[i];
			p *= x[i];
		}

		s = Math.sqrt(s / n - Math.pow(s1 / n, 2.0));
		p = Math.pow(p, 1.0 / n);

		System.out.println("S = " + s + "\t P = " + p);
	}

}
