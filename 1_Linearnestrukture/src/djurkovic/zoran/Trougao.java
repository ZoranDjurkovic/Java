package djurkovic.zoran;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Trougao {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		double a, b, c, O, s, P;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite vrednost za stranicu a ");
		a = Double.parseDouble(ulaz.readLine());

		System.out.println("Unesite vrednost za stranicu b ");
		b = Double.parseDouble(ulaz.readLine());

		System.out.println("Unesite vrednost za stranicu c ");
		c = Double.parseDouble(ulaz.readLine());

		System.out.println("Obim trougla je " + (O = a + b + c));

		s = O / 2;

		P = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("Povrsina trougla je " + P);

	}

}
