import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Vjezba14 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		double[] a = new double[100];
		double ver, x;

		DecimalFormat df = new DecimalFormat("#.###");

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite vrednost za n niza x");
		int n = Integer.parseInt(ulaz.readLine());

		System.out.println("Unesite elementa niza x");
		for (int i = 1; i <= n; i++) {
			System.out.print("a[" + i + "]= ");
			a[i] = Double.parseDouble(ulaz.readLine());

		}
		System.out.println("Unesite vrednost promenjive x");
		x = Double.parseDouble(ulaz.readLine());

		ver = x;
		for (int i = n; i >= 2; i--)
			ver = x + a[i] / ver;

		ver = a[1] / ver;

		System.out.println("Vrednost veriznog razlomka je " + df.format(ver));

	}
}