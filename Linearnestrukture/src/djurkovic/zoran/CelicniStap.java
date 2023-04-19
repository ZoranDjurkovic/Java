package djurkovic.zoran;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class CelicniStap {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		double A, L, E, deltaL, deltaA, F, mi;

		DecimalFormat df = new DecimalFormat("#.##");
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite vrednost povrsine poprecnogpreseka stapa A ");
		A = Double.parseDouble(ulaz.readLine());

		System.out.println("Unesite vrednost duzine stapa L u cm ");
		L = Double.parseDouble(ulaz.readLine());

		System.out.println("Unesite vrednost modela elasticnosti ");
		E = Double.parseDouble(ulaz.readLine());

		System.out.println("Unesite vrednost izduzenja stapa ");
		deltaL = Double.parseDouble(ulaz.readLine());

		System.out.println("Unesite vrednost kontrakcije ");
		deltaA = Double.parseDouble(ulaz.readLine());

		F = A * E * deltaL / L;
		mi = L * deltaA / (A * deltaL);

		System.out.println("Intezitet aksijalne sile F = " + df.format(F) + " kN\nVrednost Poasonovog koeficijenta je "
				+ df.format(mi));

	}

}
