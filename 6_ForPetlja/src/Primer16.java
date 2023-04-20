import java.text.DecimalFormat;

public class Primer16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Deklarisanje podataka

		double x, y, z;

		// inicijalizacija rednog broja

		int i = 0;

		DecimalFormat df = new DecimalFormat("#.##");

		// Stampanje zaglavlja
		System.out.println("\tR.br\tX\tY\tZ");

		for (x = 0.0; x <= 10.0; x += 1.0) {
			// Izracunavanje vrednosti funkcija
			y = Math.sqrt(x) + 0.2 * x - Math.pow(x, 2) / (x + 1);
			z = y - 0.3 * Math.pow(y, 2) / (y + 1);
			// Uvecanje rednog broja
			i++;

			// Stampanje razultata
			System.out.println("\t" + i + "\t" + df.format(x) + "\t" + df.format(y) + "\t" + df.format(z));
		}

	}

}
