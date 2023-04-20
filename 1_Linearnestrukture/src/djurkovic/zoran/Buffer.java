package djurkovic.zoran;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		double x;

		// Unos podataka

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite vrednost za  X: ");

		x = Double.parseDouble(ulaz.readLine());
		System.out.println(" X je: " + x);
	}

}
