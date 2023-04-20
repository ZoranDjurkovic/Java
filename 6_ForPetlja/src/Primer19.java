import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Primer19 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// q0 - trougaono opterecenje
		// L - duzina grede
		// m - napadni momenat
		// ft - transferzalna sila

		double qO, L, m, ft;

		DecimalFormat df = new DecimalFormat("#.##");

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos podataka

		System.out.println("Unesite vrednost za trougaono opterecenje qO");
		qO = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost za duzinu greda L ");
		L = Double.parseDouble(ulaz.readLine());

		// Stampanje zaglavlja

		System.out.println("\tz\tFt\tM");

		for (double z = 2.5; z < 3.5; z += 0.1) {
			ft = qO * (L / 3.0 - z * z / L) / 2.0;
			m = qO * L * L * (z / L - Math.pow(z / L, 3.0)) / 6.0;
			System.out.println("\t" + df.format(z) + "\t" + df.format(ft) + "\t" + df.format(m));
		}
	}

}
