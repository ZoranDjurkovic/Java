package djurkovic.zoran;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Galon {

	public static void main(String[] args) throws Exception {

		double g, u;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("unesite zapreminu u galonima ");
		g = Double.parseDouble(ulaz.readLine());

		System.out.println("Zapremina u litrima  " + (g * 4.54));

	}

}
