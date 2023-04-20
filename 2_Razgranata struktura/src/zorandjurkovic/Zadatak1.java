package zorandjurkovic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		double x, y;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite vrednost za x: ");
		x = Double.parseDouble(ulaz.readLine());

		if (x >= 0) {

			y = x;
		} else {
			y = -x;
		}

		System.out.println(" Za uneto X = " + x + " dobija se Y = " + y);
	}

}
