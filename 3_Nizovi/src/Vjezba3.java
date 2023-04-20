import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Vjezba3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		double[] nizA = new double[100];
		double[] x = new double[100];
		double[] y = new double[100];
		double a = 0.0, xt = 0.0, yt = 0.0;

		DecimalFormat df = new DecimalFormat("#.###");

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos dimenzija nizova

		System.out.println("Unesite broj elemenata niza");
		int n = Integer.parseInt(ulaz.readLine());

		// Unose elemenata niza a

		System.out.println("Unesite elemente niza a:");
		for (int i = 1; i <= n; i++) {
			System.out.print("a [" + i + "] =");
			nizA[i] = Double.parseDouble(ulaz.readLine());
		}

		// Unos elemenata niza x

		System.out.println("Unesite elemente niza x:");
		for (int i = 1; i <= n; i++) {
			System.out.print("x [" + i + "] =");
			x[i] = Double.parseDouble(ulaz.readLine());
		}
		// Unos elementa niza y

		System.out.println("Unesite elemente niza y:");
		for (int i = 1; i <= n; i++) {
			System.out.print("y [" + i + "] =");
			y[i] = Double.parseDouble(ulaz.readLine());
		}

		for (int i = 1; i <= n; i++) {
			a += nizA[i];
			xt += nizA[i] * x[i];
			yt += nizA[i] * y[i];
		}
		xt /= a;
		yt /= a;

		// Stampanje rezultata
		System.out.println("A= " + df.format(a) + "\nXT = " + df.format(xt) + "\nYT = " + df.format(yt));

	}

}
