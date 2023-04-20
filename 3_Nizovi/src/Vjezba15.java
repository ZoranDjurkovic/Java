import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Vjezba15 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		double[] x = new double[100];

		System.out.print("Unesite broj elemenata n niza x");
		int n = Integer.parseInt(ulaz.readLine());

		System.out.println("Unesite elemente niza x");
		for (int i = 1; i <= n; i++) {
			System.out.print("x[" + i + "]=");
			x[i] = Double.parseDouble(ulaz.readLine());

		}

		double xsr = 0;
		for (int i = 1; i <= n; i++)
			xsr += x[i];
		xsr /= n;

		double v = 0;
		for (int i = 1; i <= n; i++)
			v += (x[i] - xsr) * (x[i] - xsr);
		v /= (n - 1);

		System.out.println("V= " + v);
	}

}
