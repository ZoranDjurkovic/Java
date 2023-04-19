import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Primer5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		DecimalFormat df = new DecimalFormat("#.###");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// inicijalizacija promenjive s

		double s = 0;

		// Unos vrednosti promenjive
		System.out.println("Unesite vrednost za n ");
		int n = Integer.parseInt(ulaz.readLine());

		// Izracunavanje vrednost sume

		for (int i = 1; i <= n; i++) {
			s = Math.sqrt(6 + s);
		}
		// Stampanje izlaznog rezultata

		System.out.println("Dobijena vrednost sume je " + df.format(s));

	}

}
