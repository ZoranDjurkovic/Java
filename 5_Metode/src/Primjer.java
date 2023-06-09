import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Primjer {
	static double horn(double[] a, int n, double x) {
		double horner = a[n];
		while (n != 0) {
			horner = horner * x + a[n - 1];
			n--;
		}
		return horner;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		double[] a = { 0.75, 163.2, -3.17, 5.6, -2.34, -1.21, 26.7, -3.66, 10.2, -11, 6 };

		DecimalFormat df = new DecimalFormat();
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite vrednost za na manju od 11");
		int n = Integer.parseInt(ulaz.readLine());

		if (n < 11) {
			System.out.println("\tX\tP(X)");
			for (double x = 10.0; x <= 20.0; x += 1.0)
				System.out.println("\t" + df.format(x) + "\t" + df.format(horn(a, n, x)));
		} else
			System.out.println("Uneli ste vecu vrednost od potrebne");
	}

}
