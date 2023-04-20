package djurkovic.zoran;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LogickiIzraz {

	public static void main(String[] args) throws Exception {

		boolean x, y, z;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite vrednost za  X ");

		x = Boolean.parseBoolean(ulaz.readLine());

		System.out.println("Unesite vrednost za  Y ");

		y = Boolean.parseBoolean(ulaz.readLine());

		z = !(x & y) | x & y;

		System.out.println("y = " + z);

	}

}
