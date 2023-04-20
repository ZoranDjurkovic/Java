import java.text.DecimalFormat;

public class Zadatak1 {

	// Definisanje funkcija f i g
	static double f(double x) {
		return 2 * x - Math.log(x);
	}

	static double g(double x) {
		return Math.tan(x / 2.0) + Math.abs(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("###,##0.00");

		// Deklarisanje promenjivih x i y
		double x, y;
		// Stampanje zaglavlja
		System.out.println("\tX\tY");

		for (x = 0.1; x <= 0.9; x += 0.1) {
			// Poziv funkcija f i g
			y = f(2 * g(f(x)));
			// Stampanje izlaznog rezultata
			System.out.println("\t" + df.format(x) + "\t" + df.format(y));
		}

	}

}
