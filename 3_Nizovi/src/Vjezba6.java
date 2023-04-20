import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Vjezba6 {

	public static void man(String[] args) throws Exception {

		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite broj trojki stranica n");
		int n = Integer.parseInt(ulaz.readLine());

		System.out.println("Unesite stranice trougla a,b,c:");

		for (int i = 1; i < n; i++) {

			System.out.println("Moguce stranice" + i + ".trougla");
			System.out.print("a = ");
			a[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("b = ");
			b[i] = Double.parseDouble(ulaz.readLine());
			System.out.print("c = ");
			c[i] = Double.parseDouble(ulaz.readLine());
		}
		System.out.println("\ta\tb\tc\todgovor");
///
		for (int i = 1; i <= n; i++) {
			if (a[i] + b[i] > c[i] && Math.abs(a[i] - b[i]) < c[i])
				System.out.println("\t" + a[i] + "\t" + b[i] + "\t" + c[i] + "\t" + "da");
			else
				System.out.println("\t" + a[i] + "\t" + b[i] + "\t" + c[i] + "\t" + "ne");
		}

	}

}
