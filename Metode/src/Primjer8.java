import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primjer8 {
	static final double k = 9 * Math.pow(10, 9);

	// sila metoda za izracunavanje sile privlacenja izmedju dve cestice
	// q1.q2 - naelektrisanje cestica
	// r-rastojanje izmedju cestica

	public static double sila(double q1, double q2, double r) {
		return k * q1 * q2 / (r * r);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// Deklarisanje podataka
		double q1, q2, r;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		// unos podataka

		System.out.println("Unesite vrednost prvog naelektrisanja q1");
		System.out.print("q1 = ");
		q1 = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost drugog naelektrisanja q2");
		System.out.print("q2 = ");
		q2 = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost za rastojanje  r(m) ");
		System.out.print("r = ");
		r = Double.parseDouble(ulaz.readLine());

		System.out.println("Za q1 = " + q1 + " C, q2 = " + q2 + " C i rastojanje r = " + r + " m, sila je F = "
				+ sila(q1, q2, r) + " N. ");
	}

}
