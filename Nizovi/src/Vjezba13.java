import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Vjezba13 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		double[] x = new double[100];

		DecimalFormat df = new DecimalFormat("#.###");

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite vrednost za a");
		double a = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost za n niza x");
		int n = Integer.parseInt(ulaz.readLine());

		System.out.println("Unesite elementa niza x");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "]= ");
			x[i] = Double.parseDouble(ulaz.readLine());

		}
		double ver = n * Math.sqrt(a);
		for (int i = n - 1; i >= 1; i--)
			ver = i * Math.sqrt(a) + (x[i] - x[i + 1]) / ver;

		System.out.println("Vrednost veriznog razlomka " + df.format(ver));

	}

}
