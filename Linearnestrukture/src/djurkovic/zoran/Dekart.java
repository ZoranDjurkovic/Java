package djurkovic.zoran;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Dekart {

	public static void main(String[] args) throws Exception {

		// f - intezitet sile
		// alfa - ugao sile F i koordinate ose
		// x,y -Dekartove koordinate

		double f, alfa, x, y;

		DecimalFormat df = new DecimalFormat("#.##");

		// Unos podataka

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite vrednost za intezitet sile F (kN) ");
		f = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost za ugao alfa u stepenima ");
		alfa = Math.toRadians(Double.parseDouble(ulaz.readLine()));

		// Izra;unavanje vrednost Dekartovih koordinata

		x = f * Math.cos(alfa);
		y = f * Math.sin(alfa);

		// Stanpanje rezultata

		System.out.println(" Vrednost Dekartovih koordinata su X = " + df.format(x + " \tY = " + df.format(y)));

	}

}
