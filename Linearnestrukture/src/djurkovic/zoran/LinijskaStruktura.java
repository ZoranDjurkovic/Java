package djurkovic.zoran;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LinijskaStruktura {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		double x, y, z, f;

		// Unos podataka

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite vrednost za X ");
		x = Double.parseDouble(ulaz.readLine());

		System.out.println("Unesite vrednost za Y ");
		y = Double.parseDouble(ulaz.readLine());

		System.out.println("Unesite vrednost za Z ");
		z = -Double.parseDouble(ulaz.readLine());

		// Izracunavanje vrednosti funkcije

		f = Math.pow((x + 3 * z + y) / (2 * x), 4) - x / (x + 3 * z - y);

		// Stampanje rezultata

		System.out.println("Unesite vrednost za f " + f);

	}

}
