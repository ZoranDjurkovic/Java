import java.text.DecimalFormat;

public class while12 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		double y, x = 1;
		int i = 0;

		DecimalFormat df = new DecimalFormat("#.##");

		// Stampanje zaglavlja

		System.out.println("\tR.BR\tX\tY(X)");

		while (x <= 10.0) {
			// Izracunavanje vrednosti funkcije
			y = x - 0.3 * Math.pow(x, 2) / (x + 1.2);
			i++;
			// Stampanje rezultata
			System.out.println("\t" + i + "\t" + df.format(x) + "\t" + df.format(y));
			x += 0.5;
		}
	}

}
