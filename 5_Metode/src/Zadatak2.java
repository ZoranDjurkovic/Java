import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak2 {
	// Metoda za izracunavanje dometa
	public static double d(double v0, double alfa, double g) {
		return v0 * v0 * Math.sin(2 * alfa) / g;
	}

	// Metod za izracunavanje visine
	public static double h(double v0, double alfa, double g) {
		return v0 * v0 * Math.pow(Math.sin(alfa), 2) / (2 * g);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// g - ubrzanje zemljine teze
		// v0 - pocetna brzina granate
		// alfa - ugao elavacije

		double g = 9.81, v0, alfa;

		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos podataka
		System.out.print("Unesite vrednost za pocetnu brzinu v0 (m/s): ");
		v0 = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za ugao elavacije alfa (STEPENI): ");
		alfa = Double.parseDouble(ulaz.readLine());

		// Stampanje rezultata
		System.out.println("Dmax = " + df.format(d(v0, alfa, g)) + " m\tHmax = " + df.format(h(v0, alfa, g)) + " m ");

	}

}
