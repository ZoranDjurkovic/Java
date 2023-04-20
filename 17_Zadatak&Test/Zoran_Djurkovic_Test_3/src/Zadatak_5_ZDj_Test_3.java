import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak_5_ZDj_Test_3 {

	static double fun(double q1, double q2, double r) {
		double f;
		double k = 9E9;
		f = k * ((q1 * q2) / (r * r));

		return f;

	}

	public static void main(String[] args) throws Exception {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.###");

		System.out.println("Unesite naelekrtrisanje q1 ");
		double q1 = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite naelekrtrisanje q2 ");
		double q2 = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite rastojanje r ");
		double r = Double.parseDouble(ulaz.readLine());

		System.out.println("Sila privlacenja je " + df.format(fun(q1, q2, r)));
	}

}
