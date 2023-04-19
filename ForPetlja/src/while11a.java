import java.text.DecimalFormat;

public class while11a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double f, x;

		DecimalFormat df = new DecimalFormat("#.##");

		// Stampanje zaglavlja

		System.out.println("\tX\tF(X)");

		for (x = 1.0; x <= 2.0; x += 0.2) {
			// Izracunavanje vrednosti funkcije
			f = 41.926 * Math.sqrt(1 + Math.pow(x, 3)) + Math.pow(x, 1.0 / 3.0) * Math.exp(x);

			// Stampanje rezultata
			System.out.println("\t" + df.format(x) + "\t" + df.format(f));

		}

	}

}
