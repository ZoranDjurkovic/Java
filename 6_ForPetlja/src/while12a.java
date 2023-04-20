import java.text.DecimalFormat;

public class while12a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double y, x;
		int i = 0;

		DecimalFormat df = new DecimalFormat("#.##");

		// Stampanje zaglavlja

		System.out.println("\tR.BR\tX\tY(X)");

		for (x = 1.0; x <= 10.0; x += 0.5) {
			// Izracunavanje vrednosti funkcije
			y = x - 0.3 * Math.pow(x, 2) / (x + 1.2);
			i++;
			// Stampanje rezultata
			System.out.println("\t" + i + "\t" + df.format(x) + "\t" + df.format(y));

		}
	}

}
