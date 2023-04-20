import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Vjezba16 {

	public static void main(String[] args) throws Exception {

		double[] a = new double[100];
		double[] x = new double[100];
		double[] y = new double[100];

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.###");

		System.out.println("Unesite broj n: ");
		int n = Integer.parseInt(ulaz.readLine());

		for (int i = 1; i <= n; i++) {
			System.out.println(i + ".unos podataka");
			System.out.print("a=");
			a[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("x=");
			x[i] = Double.parseDouble(ulaz.readLine());

		}
		y[1] = 0;
		for (int i = 2; i <= n; i++)
			if (x[i] > 0)
				y[i] = a[i] * x[i];
			else
				y[i] = y[i - 1];

		System.out.println("\tR.BR\tA\tX\ty");
		for (int i = 1; i <= n; i++)
			System.out.println("\t" + i + "\t" + a[i] + "\t" + x[i] + "\t" + df.format(y[i]));

	}

}
