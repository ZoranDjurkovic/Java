package djurkovic.zoran;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rastojanje {

	public static void main(String[] args) throws Exception {

		double x1, x2, a1, y1, y2, a2;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite kordinate za prvu x tacku");
		x1 = Double.parseDouble(ulaz.readLine());

		System.out.println("Unesite kordinate za prvu y tacku");
		y1 = Double.parseDouble(ulaz.readLine());

		a1 = Math.sqrt(x1 * x1 + y1 * y1);

		System.out.println("Unesite kordinate za drugu x tacku");
		x2 = Double.parseDouble(ulaz.readLine());

		System.out.println("Unesite kordinate za drugu y tacku");
		y2 = Double.parseDouble(ulaz.readLine());

		a2 = Math.sqrt(x2 * x2 + y2 * y2);

		System.out.println("Rastojanje prve tacke ( " + x1 + "," + y1 + ") od koordinatnog pocetka je " + a1);
		System.out.println("Rastojanje prve tacke ( " + x2 + "," + y2 + ") od koordinatnog pocetka je " + a2);

	}

}
