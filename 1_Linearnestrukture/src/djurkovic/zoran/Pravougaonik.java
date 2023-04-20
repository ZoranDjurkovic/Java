package djurkovic.zoran;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pravougaonik {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		double a, b;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite vrednost za stranicu a ");
		a = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite vrednost za stranicu b ");
		b = Double.parseDouble(ulaz.readLine());

		System.out.println("Dijagonala pravougaonika je " + Math.sqrt((Math.pow(a, 2) + (Math.pow(b, 2)))));
	}

}
