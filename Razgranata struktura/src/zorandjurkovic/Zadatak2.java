package zorandjurkovic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		double x, y;

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite vrednost za x ");

		x = Double.parseDouble(ulaz.readLine());

		y = (x >= 0) ? x : -x;

		System.out.println("Za uneto X = " + x + " dobija se Y =  " + y);

	}

}
