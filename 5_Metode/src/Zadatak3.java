import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak3 {

	// gama - univerzalnagravitaciona konstanta
	static final double gama = 6.67 * Math.pow(10, -11);

	// sila - metoda za izracunavanje sile privlacenja
	// izmedju dve materijalne tacke
	// m1,m2 - masa tijela
	// r - rastojanje izmedju tezista materijalnih tijela
	public static double sila(double m1, double m2, double r) {
		return gama * m1 * m2 / (r * r);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		double m1, m2, r;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// Unos podataka
		System.out.println("Unesite vrednost za mase (kg): ");
		System.out.print("m1= ");
		m1 = Double.parseDouble(ulaz.readLine());
		System.out.print("m2 = ");
		m2 = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za rastojanje r (m) ");
		r = Double.parseDouble(ulaz.readLine());

		// Stampanje rezultata
		System.out.println("Za m1 = " + m1 + "kg, m2 = " + m2 + " kg i rastojanje r = " + r + " m, sila je F = "
				+ sila(m1, m2, r) + " N.");

	}

}
