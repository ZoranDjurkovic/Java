import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Primer7 {

	public static void main(String[] args) throws Exception {

		DecimalFormat df = new DecimalFormat("#.###");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		double p = 1, q = 1;

		System.out.println("Unesite vrednost za n ");
		int n = Integer.parseInt(ulaz.readLine());

		for (int i = 2; i <= n; i++) {
			q *= 1;
			p *= (1 + 1 / q);
		}
		System.out.println("Dobijena vrednost proizvodaa " + df.format(p));
	}

}
